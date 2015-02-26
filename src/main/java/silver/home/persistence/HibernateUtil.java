package silver.home.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author mountassirbrahim
 *
 */
public class HibernateUtil {
	 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    /*
     * Create an hibernate session 
     * */
    
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    /*
     * Close hibernate session
     * */
    
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }
 
}
