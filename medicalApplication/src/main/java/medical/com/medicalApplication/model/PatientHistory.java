package medical.com.medicalApplication.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Author: SNHU
 * Edit By: Francis Rinehart
 * Email: Francis.rinehart@SNHU.EDU
 * Language: Java
 * Purpose: This class represents a patient history model in the system
 *
 */

public class PatientHistory {

	private List<Treatment> treatments;
	private List<Medication> medications;
	private List<Allergy> allergy;

	public PatientHistory() {
		this.treatments = new ArrayList<Treatment>();
		this.medications = new ArrayList<Medication>();
		this.allergy = new ArrayList<Allergy>();
	}

	public void addTreatment(Treatment treatment) {
		treatments.add(treatment);
	}

	public void addAllergy(Allergy allegry) {
		allergy.add(allegry);
	}

	public void addMedication(Medication medication) {
		if(treatments != null){
			medications.add(medication);
		}
	}

	public List<Allergy> getAlergies() {
		return allergy;
	}

	public List<Treatment> getAllTreatments() {
		return treatments;
	}

	public List<Medication> getAllMedications() {
		return medications;
	}

}
