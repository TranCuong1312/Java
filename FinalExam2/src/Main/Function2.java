package Main;

import java.util.Scanner;

import PresentationLayer.Present2;
import Util.ScannerUtil;
import enity.Employee;
import enity.Manager;

public class Function2 {
	 private Present2 pre2;
	 private Scanner s;
	 
	 public Function2() {
		 pre2 = new Present2();
		 s = new Scanner(System.in);
	 }
	 
	 public void create() {
			Employee em =new Employee();
			try {
				System.out.println("Firstname: ");
				String firstname= ScannerUtil.readString(s, "firstname chua dung");
				em.setFirstName(firstname);
				System.out.println("Lastname: ");
				String lastname= ScannerUtil.readString(s, "lastname chua dung");
				em.setLastName(lastname);
				System.out.println("Phone: ");
				String phone=ScannerUtil.readString(s, "Phone chua dung");
				em.setPhone(phone);
				System.out.println("Email: ");
				String email=ScannerUtil.readString(s, "Email chua dung");
				em.setEmail(email);
				System.out.println("Password: ");
				String pass=ScannerUtil.readString(s, "Password chua dung");
				em.setPassword(pass);
				System.out.println("Projectname: ");
				String project = ScannerUtil.readString(s, "Projectname chua dung");
				em.setPassword(pass);
				System.out.println("Proskill: ");
				String proskill =ScannerUtil.readString(s, "Proskill chua dung");
				em.setProskill(proskill);
				pre2.create(firstname, lastname, phone, email, pass, project, proskill);
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
				pre2.login(email, pass);
			} catch(Exception e) {
				System.out.println(e);
			}
	}
}
