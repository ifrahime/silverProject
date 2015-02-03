package silver.home.common;

import org.hibernate.Session;

import silver.home.persistence.HibernateUtil;

public class App {

	
	
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        
        PatientData pData=new PatientData();
        pData.setId(3);;
        pData.setPatientWeight(80.5);
        pData.setPerfectWeight(70);
        pData.setPatientTension(120);
        pData.setDate("02/02/2015");
        
        session.save(pData);
        session.getTransaction().commit();
    }
	
	
	
}
