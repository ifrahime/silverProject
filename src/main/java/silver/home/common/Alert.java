package silver.home.common;


import java.io.Serializable;

/**
 * @author mountassirbrahim
 *
 */


public class Alert implements Serializable{
	private String yellowAlert;
	private String RedAlert;
	private String OrangeAlert;
	
	
	public String getYellowAlert() {
		return yellowAlert;
	}


	public void setYellowAlert(String yellowAlert) {
		this.yellowAlert = yellowAlert;
	}


	public String getRedAlert() {
		return RedAlert;
	}


	public void setRedAlert(String redAlert) {
		RedAlert = redAlert;
	}


	public String getOrangeAlert() {
		return OrangeAlert;
	}


	public void setOrangeAlert(String orangeAlert) {
		OrangeAlert = orangeAlert;
	}


	public Alert()
	{
		yellowAlert="Prise de poids de 1kg : Eventuel contact du patient";
		
		OrangeAlert="Prise de poids > 2kg : Prise de contact avec le patient dans les 24h";
		
		RedAlert="Prise de poids > 4kg : Appel nécessaire du patient et consultation obligatoire rapide";
	}
	
}
