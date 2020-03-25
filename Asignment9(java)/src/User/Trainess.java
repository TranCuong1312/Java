package User;

public class Trainess {
	private String 	account;
	private String firstname, lastname;
	private String email;
	
	public Trainess(String account, String firstname, String lastname, String email) {
		this.account=account;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}
	
	public Trainess() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getAccount() {
		return account;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public String getEmail() {
		return email;
	}

	public void setAccount(String readString) {
		// TODO Auto-generated method stub
		this.account=account;
	}

	public void setFirstName(String readString) {
		// TODO Auto-generated method stub
		this.firstname=firstname;
	}

	public void setLastName(String readString) {
		// TODO Auto-generated method stub
		this.lastname=lastname;
	}

	public void setEmail(String readString) {
		// TODO Auto-generated method stub
		this.email=email;
	}
}
