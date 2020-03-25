package Enity;

public class manager {
	private String FirstName, LastName, Phone, Email;
	private int ExpInYear;
	
	public manager(String FirstName, String lastName, String Phone, String Email, int ExpInYear) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Phone=Phone;
		this.Email=Email;
		this.ExpInYear=ExpInYear;
	}
	
	public manager() {
		// TODO Auto-generated constructor stub
	}

	public void setFirstName(String string) {
		this.FirstName=FirstName;
	}
	
	public void setLastName() {
		this.LastName=LastName;
	}
	
	public void setPhone() {
		this.Phone=Phone;
	}
	
	public void setEmail(String string) {
		this.Email=Email;
	}
	
	public void setExpInYear() {
		this.ExpInYear=ExpInYear;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public int getExpInYear() {
		return ExpInYear;
	}
}
