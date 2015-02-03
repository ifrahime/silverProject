package silver.home.common;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.hibernate.Session;

import silver.home.persistence.HibernateUtil;

public class App {

	
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL + Drools");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        PatientData pData=new PatientData();
        pData.setId(2);;
        pData.setPatientWeight(75);
        pData.setPerfectWeight(70);
        pData.setPatientTension(120);
        pData.setDate("02/02/2015");
        
        session.save(pData);
        
        
        
		// load up the rulebase
        /*RuleBase ruleBase;
		try {
			ruleBase = readRule();
			WorkingMemory workingMemory = ruleBase.newStatefulSession();
			session = HibernateUtil.getSessionFactory().openSession();
			workingMemory.setGlobal("hibernateSession", session);
			workingMemory.fireAllRules();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        */
        
        
		try {
			KnowledgeBase kbase = readKnowledgeBase();
			StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
	        KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
	        ksession.insert(pData);
        	ksession.fireAllRules();
        	logger.close();
        	session.getTransaction().commit();
        	session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        
        
		
		
    }
	
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
	
	/*
	private static RuleBase readRule() throws Exception {
		// read in the source
		Reader source = new InputStreamReader(App.class
				.getResourceAsStream("/rules/alert.drl"));

		PackageBuilder builder = new PackageBuilder();

		// this will parse and compile in one step
		builder.addPackageFromDrl(source);

		// get the compiled package (which is serializable)
		org.drools.rule.Package pkg = builder.getPackage();

		// add the package to a rulebase (deploy the rule package).
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(pkg);
		return ruleBase;
	}
	*/
	
	
}
