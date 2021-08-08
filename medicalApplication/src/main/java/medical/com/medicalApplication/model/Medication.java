package medical.com.medicalApplication.model;

/**
 * Author: SNHU
 * Edit By: Francis Rinehart
 * Email: Francis.rinehart@SNHU.EDU
 * Language: Java
 * Purpose: This class represents the mediation model in the system
 *
 */

public class Medication {
	private String name;
	private String startDate;
	private String endDate;
	private String dose;
	private String doctor;

	public Medication(String name, String startDate, String endDate, String dose, String doctor) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dose = dose;
		this.doctor = doctor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}
	
	// Doctor function retrieves the doctors name
	public String getDoctor() {
		return doctor;
	}
	
	// Doctor function includes a new doctor to the system
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	// This returns what the doctor has prescribed. 
	@Override
	public String toString() {
		return "Medication:"+ name + ", Start Date: " + startDate + ", End Date: "+ endDate + ", Dose: "+ dose + ", Doctor: " + doctor;
		// Returns the variables for String
	}

}
