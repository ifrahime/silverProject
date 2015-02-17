package silver.home.common;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class PatientData implements Serializable{
	
	private int patientNumber;
	private int patientID;
	private double patientWeight;
	private double perfectWeight;
	private double systolicPressure;
	private double diastolicPressure;
	private Date date;
	private String typeAlert;





	public PatientData() {
	}
	

	public PatientData(int patientNumber, int patientID, double patientWeight,
			double perfectWeight, double systolicPressure,
			double diastolicPressure, Date date, String typeAlert) {
		super();
		this.patientNumber = patientNumber;
		this.patientID = patientID;
		this.patientWeight = patientWeight;
		this.perfectWeight = perfectWeight;
		this.systolicPressure = systolicPressure;
		this.diastolicPressure = diastolicPressure;
		this.date = date;
		this.typeAlert = typeAlert;
	}








	public int getPatientNumber() {
		return patientNumber;
	}




	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}









	public int getPatientID() {
		return patientID;
	}






	public void setPatientID(int patientID) {
		this.patientID = patientID;
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



	public Date getDate() {
		return date;
	}






	public void setDate(Date date) {
		this.date = date;
	}






	public String getTypeAlert() {
		return typeAlert;
	}






	public void setTypeAlert(String typeAlert) {
		this.typeAlert = typeAlert;
	}


	public double getSystolicPressure() {
		return systolicPressure;
	}



	public void setSystolicPressure(double systolicPressure) {
		this.systolicPressure = systolicPressure;
	}



	public double getDiastolicPressure() {
		return diastolicPressure;
	}



	public void setDiastolicPressure(double diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}
	

}
