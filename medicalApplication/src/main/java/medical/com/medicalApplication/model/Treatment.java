package medical.com.medicalApplication.model;
/**
 * Author: SNHU
 * Edit By: Francis Rinehart
 * Email: Francis.rinehart@SNHU.EDU
 * Language: Java
 * Purpose: This class represents a treatment model in the system.
 * 
 */

public class Treatment {
	private String treatmentDate;
	private String diagnose;
	private String description;
	private String doctor; // Added string doctor to class

	public Treatment(String doctor, String treatmentDate, String diagnose, String description) {
		super();
		this.doctor = doctor; // Added doctor to treatment class
		this.treatmentDate = treatmentDate;
		this.diagnose = diagnose;
		this.description = description;
	}

	// Add the getDoctor function to retrieve doctors name
	public String getDoctor() {
		return doctor;
	}
	
	// Add the setDoctor function to input the doctors name
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
	public String getTreatmentDate() {
		return treatmentDate;
	}

	public void setTreatmentDate(String treatmentDate) {
		this.treatmentDate = treatmentDate;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// return information based on this string
	@Override
	public String toString() {
		return "Treatment: " + " Date: "+ treatmentDate + ", Doctor: " + doctor + ", Diagnosis: " + diagnose + ", Notes: " + description;
	}

}
