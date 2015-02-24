package silver.home.common;

import java.io.Serializable;

/**
 * @author mountassirbrahim
 *
 */
public class UserRegistration implements Serializable{

	private int index;
	private String password;
	private String email;
	
	
	
	public UserRegistration(int index, String email, String password
			) {
		super();
		this.index = index;
		this.password = password;
		this.email = email;
	}



	public UserRegistration() {
		// TODO Auto-generated constructor stub
	}



	public int getIndex() {
		return index;
	}



	public void setIndex(int index) {
		this.index = index;
	}

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
