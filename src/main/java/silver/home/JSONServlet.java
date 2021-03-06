package silver.home;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.*;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.hibernate.Query;
import org.hibernate.Session;
import silver.home.common.PatientData;
import silver.home.persistence.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * @author mountassirbrahim
 *
 */


/*
 * Servlet permettant de communiquer avec le Raspberry et la base de données
 * 
 * */



public class JSONServlet extends HttpServlet{

	
	// This will store all received data
    List<PatientData> data = new LinkedList<PatientData>();
 
    /***************************************************
     * 
     * URL: /jsonservlet
     * doPost(): receives JSON data, parse it, map it and send back as JSON
     * 
     ****************************************************/
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    	
        // 1. get received JSON data from request
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if(br != null){
            json = br.readLine();
        }
 
        // 2. initiate jackson mapper
        ObjectMapper mapper = new ObjectMapper();
 
        // 3. Convert received JSON to Article
        PatientData pData = mapper.readValue(json, PatientData.class);
 
        // 4. Set response type to JSON
        response.setContentType("application/json");            
        
        System.out.println("Maven + Hibernate + MySQL + Drools");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();        
        
        
        
        try {
			KnowledgeBase kbase = readKnowledgeBase();
			StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
	        KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
	        ksession.insert(pData);
        	ksession.fireAllRules();
        	logger.close();
        	session.save(pData);
        	session.getTransaction().commit();
        	session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
       
        // 5. Add data to List<patientData>
        data.add(pData);
        
        // 6. Send List<data> as JSON to client
        mapper.writeValue(response.getOutputStream(), data);
    }
   
    
    
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {       
      	// This will store all received articles
         List<PatientData> dataReceived = new LinkedList<PatientData>();
    	 Session session = HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();  
         String id=req.getParameter("patientID");
         System.out.println("Parameter : "+id);
         Query q=null;
         if(id!=null)
         {
        	 q=session.createQuery("FROM PatientData WHERE patientID = '"+id+"'"); 
         }else
         {
        	 q=session.createQuery("FROM PatientData");
         }
         List listOfPatientData=q.list();
         Iterator rs=listOfPatientData.iterator();
         while(rs.hasNext()){
        	System.out.println("Length of listOfPatientData is : "+listOfPatientData.size());
        	PatientData pTemp=(PatientData)rs.next(); 
        	System.out.println("Data received : "+pTemp.getDate());
        	dataReceived.add(pTemp);
         }
         // 2. initiate jackson mapper
         ObjectMapper mapper = new ObjectMapper();
         mapper.writeValue(resp.getOutputStream(), dataReceived);
         session.getTransaction().commit();
         session.close();	  
	}

    /*
     * Function allows to communicate with Raspberry using REST service
     * 
     * */
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crunchifyREST(InputStream incomingData) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
            String line = null;
            while ((line = in.readLine()) != null) {
            	builder.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error Parsing: - ");
        }
        System.out.println("Data Received: " + builder.toString());
 
        // return HTTP response 200 in case of success
        return Response.status(200).entity(builder.toString()).build();
    }

    
    /*
     * readKnowledgeBase is a function that load DROOLS rules from resources
     * 
     * */
    
	private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("alert.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }
	
}
