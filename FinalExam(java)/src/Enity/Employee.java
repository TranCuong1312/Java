package Enity;

public class Employee {
	
	
	private String FirstName, LastName, Phone, Email;
	private String ProjectName, ProSkill;
	
	public Employee(String FirstName, String lastName, String Phone, String Email, String ProjectName, String ProSkill) {
		super();
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Phone=Phone;
		this.Email=Email;
		this.ProjectName=ProjectName;
		this.ProSkill= ProSkill;
	}
	
	
	public Employee() {
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
	
	public void setProjectName() {
		this.ProjectName=ProjectName;
	}
	
	public void setProSkill() {
		this.ProSkill= ProSkill;
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
	
	public String getProjectName() {
		return ProjectName;
	}
	
	public String getProSkill() {
		return ProSkill;
	}
}
