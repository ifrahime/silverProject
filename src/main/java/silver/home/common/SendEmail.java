package silver.home.common;



import java.io.Serializable;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;

/**
 * @author mountassirbrahim
 *
 */
public class SendEmail implements Serializable{

    private  String USER_NAME; // GMail user name (just the part before "@gmail.com")
    private  String PASSWORD; // GMail password

    public String getUSER_NAME() {
		return USER_NAME;
	}


	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}


	public SendEmail()
    {
    	USER_NAME="silverhome8000";
    	PASSWORD="aznetwork";
    }

    
    public void send(String RECIPIENT,String subject, String body) {
//    	System.out.println("RECEPTIENT : "+RECIPIENT+" Subject : "+subject+" Body : "+body);
        String[] to = { RECIPIENT }; // list of recipient email addresses
        sendFromGMail(to, subject, body);
    }

    public void sendFromGMail(String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", getUSER_NAME());
        props.put("mail.smtp.password", getPASSWORD());
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(getUSER_NAME()));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, getUSER_NAME(), getPASSWORD());
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}