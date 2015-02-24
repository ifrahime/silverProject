package silver.home.persistence;


import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import silver.home.common.UserRegistration;

/**
 * @author mountassirbrahim
 *
 */
public class LoginManager {

    private Session session;
    private int count = 0;

    
    
    public LoginManager() {
	}



	public boolean isValidLogin(String email, String pass) {
		System.out.println("email : "+email+"§§§§ pass : "+pass);
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
        String query = "select reg.email,reg.password from UserRegistration as reg where reg.email='" + email + "' and reg.password='" + pass + "'";
        Query DBquery = session.createQuery(query);
        for (Iterator it = DBquery.iterate(); it.hasNext();) {            it.next();
            count++;
        }
        System.out.println("Total rows: " + count);
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}