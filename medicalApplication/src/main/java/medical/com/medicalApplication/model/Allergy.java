package medical.com.medicalApplication.model;

/**
 * Author: SNHU
 * Edit By: Francis Rinehart
 * Email: Francis.rinehart@SNHU.EDU
 * Language: Java
 * Purpose: This class represent the Allergy model in the application
 * 
 */

public class Allergy {
	private String name;

	public Allergy(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Allergy " + name;
	}	
	
}
