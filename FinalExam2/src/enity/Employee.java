package enity;

public class Employee {
	
	private String firstname;	
	private String lastname;	
	private String phone;
	private String email;
	private String pass;
	private String project;
	private String proskill;
	

	
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstname;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastname;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return pass;
	}
	
	public void setPassword(String pass) {
		this.pass = pass;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}
	
	public String getProskill() {
		return proskill;
	}
	
	public void setProskill(String proskill) {
		this.proskill = proskill;
	}
}
