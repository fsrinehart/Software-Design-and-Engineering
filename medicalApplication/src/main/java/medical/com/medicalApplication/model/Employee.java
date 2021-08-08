package medical.com.medicalApplication.model;
/**
 * Author: SNHU
 * Edit By: Francis Rinehart
 * Email: Francis.rinehart@SNHU.EDU
 * Language: Java
 * Purpose: This class represents the employee model in the system
 *
 */
public class Employee {
	private String name;
	private String id;
	private String password;
	
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		this.password = "Open";
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
}
