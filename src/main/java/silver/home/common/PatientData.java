package silver.home.common;

import java.io.Serializable;

public class PatientData implements Serializable{
	
	private String id;
	private double patientWeight;
	private double perfectWeight;
	private double patientTension;
	private String date;
	private String typeAlert;
	
	





	public PatientData() {
	}
	
	
	



	public PatientData(String id, double patientWeight, double perfectWeight,
			double patientTension, String date, String typeAlert) {
		super();
		this.id = id;
		this.patientWeight = patientWeight;
		this.perfectWeight = perfectWeight;
		this.patientTension = patientTension;
		this.date = date;
		this.typeAlert = typeAlert;
	}






	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public double getPatientWeight() {
		return patientWeight;
	}



	public void setPatientWeight(double patientWeight) {
		this.patientWeight = patientWeight;
	}



	public double getPerfectWeight() {
		return perfectWeight;
	}



	public void setPerfectWeight(double perfectWeight) {
		this.perfectWeight = perfectWeight;
	}



	public double getPatientTension() {
		return patientTension;
	}



	public void setPatientTension(double patientTension) {
		this.patientTension = patientTension;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}






	public String getTypeAlert() {
		return typeAlert;
	}






	public void setTypeAlert(String typeAlert) {
		this.typeAlert = typeAlert;
	}


	
	
	
	
	

}
