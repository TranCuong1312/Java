package PrenetationLayer;

import java.util.Scanner;

import BussinessLayer.Buss;
import BussinessLayer.Buss2;
import BussinessLayer.interfaceBuss;
import BussinessLayer.interfaceBuss2;

public class Controller2 {
	private interfaceBuss2 b2;
	public Controller2() {
		b2=new Buss2();
	}
	public boolean register(String FirstName, String LastName, String Phone, String Email, String ProjectName,
			String ProSkill) {
		Scanner s=new Scanner(System.in);
		boolean ys1, ys2,ys3,ys4,ys5,ys6,ys7;
		String FirstNamePattern="^[A-Za-z]";
		String LastnamePattern="^[A-Za-z]";
		String PhonePattern="{9,12}";
		String EmailPattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String Project1="Testingsystem";
		String Project2="CRM";
		String Project3="TimeSheet";
		ys1=FirstName.matches(FirstNamePattern);
		if(!ys1) {
			System.out.println("Sorry, bro.");
		}
		ys2=LastName.matches(LastnamePattern);
		if(!ys2) {
			System.out.println("Sorry, bro.");
		}
		ys3=Phone.matches(PhonePattern);
		if(!ys3) {
			System.out.println("Sorry, bro.");
		}
		ys4=Email.matches(EmailPattern);
		if(!ys4) {
			System.out.println("Sorry, bro.");
		}
		ys5=ProjectName.matches(Project1);
		ys6=ProjectName.matches(Project2);
		ys7=ProjectName.matches(Project3);
		if(!ys5||!ys6||!ys7) {
			System.out.println("Sorry,bro");
		}
		return b2.register(FirstName, LastName, Phone, Email, ProjectName, ProSkill);
	}

	public boolean login(String FirstName, String LastName, String Phone, String Email, String ProjectName,
			String ProSkill) {
		Scanner s=new Scanner(System.in);
		boolean ys1, ys2;
		String FirstNamePattern="^[A-Za-z]";
		
	
		String EmailPattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		ys1=FirstName.matches(FirstNamePattern);
		if(!ys1) {
			System.out.println("Sorry, bro.");
		}
		
		ys2=Email.matches(EmailPattern);
		if(!ys2) {
			System.out.println("Sorry, bro.");
		}
		//to Buss2
		return b2.login(FirstName, Email);
	}

}
