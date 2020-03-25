package PrenetationLayer;

import java.util.Scanner;

import BussinessLayer.Buss;
import BussinessLayer.interfaceBuss;

public class Controller {
	private interfaceBuss b;
	public Controller() {
		b=new Buss();
	}
	public boolean Login(String FirstName, String LastName, String Phone, String Email, int ExpInYear) {
		// TODO Auto-generated method stub
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
		
		return b.login(FirstName, Email);
	}

	public boolean register(String FirstName, String LastName, String Phone, String Email, int ExpInYear) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean ys1, ys2,ys3,ys4;
		String FirstNamePattern="^[A-Za-z]";
		String LastnamePattern="^[A-Za-z]";
		String PhonePattern="{9,12}";
		String EmailPattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
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
		if(ExpInYear>20||ExpInYear<0) {
			System.out.println("Sorry, bro");
		}
		//to Buss
		return b.register(FirstName, LastName, Phone, Email, ExpInYear);
	}

}
