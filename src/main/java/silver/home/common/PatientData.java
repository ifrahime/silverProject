package silver.home.common;

import java.io.Serializable;

public class PatientData implements Serializable{
	
	private int id;
	private double patientWeight;
	private double perfectWeight;
	private double patientTension;
	private String date;
	
	
	public PatientData() {
	}
	
	
	public PatientData(int id, double patientWeight, double perfectWeight,
			double patientTension, String date) {
		super();
		this.id = id;
		this.patientWeight = patientWeight;
		this.perfectWeight = perfectWeight;
		this.patientTension = patientTension;
		this.date = date;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
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


	
	

}
