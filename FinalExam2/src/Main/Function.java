package Main;

import java.util.Scanner;

import PresentationLayer.Present;
import Util.ScannerUtil;
import enity.Manager;

public class Function {
	private Present pre;
	private Scanner s;
 
	public Function() {
		pre = new Present();
	 	s = new Scanner(System.in);
	}
	
	public void create() {
		Manager m= new Manager();
		try {
			System.out.println("Firstname: ");
			String firstname= ScannerUtil.readString(s, "firstname chua dung");
			m.setFirstName(firstname);
			System.out.println("Lastname: ");
			String lastname= ScannerUtil.readString(s, "lastname chua dung");
			m.setLastName(lastname);
			System.out.println("Phone: ");
			String phone=ScannerUtil.readString(s, "Phone chua dung");
			m.setPhone(phone);
			System.out.println("Email: ");
			String email=ScannerUtil.readString(s, "Email chua dung");
			m.setEmail(email);
			System.out.println("Password: ");
			String pass=ScannerUtil.readString(s, "Password chua dung");
			m.setPassword(pass);
			System.out.println("ExpinYear: ");
			int expinyear=ScannerUtil.readInt(s, "Number, please");
			m.setExpinyear(expinyear);
			pre.create(firstname, lastname, phone, email, pass, expinyear);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void login() {
		try {
			System.out.println("Email: ");
			String email =ScannerUtil.readString(s, "Email chua dung");
			System.out.println("Password: ");
			String pass =ScannerUtil.readString(s, "Password chuwa dung");
			pre.login(email, pass);
		} catch(Exception e) {
			System.out.println(e);
		}
}
	
	
}
