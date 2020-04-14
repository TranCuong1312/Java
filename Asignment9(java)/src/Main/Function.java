package Main;

import java.sql.Date;
import java.util.Scanner;

import Pre.pre;
import Utils.ScannerUtil;

public class Function {
	
	private pre p;
	private Scanner s;
	
	public Function() {
		p = new pre();
		s = new Scanner(System.in);
	}
	
	public void createworkdone() {
		try {
			System.out.println("WORKDONEID: ");
			int WORKDONEID = ScannerUtil.readInt(s,"Fill it!");
			System.out.println("EMPLOYEEID: ");
			int EMPLOYEEID = ScannerUtil.readInt(s, "Fill it!");
			System.out.println("MODULEID: ");
			int MODULEID = ScannerUtil.readInt(s, "errorMessage");
			System.out.println("WORKDONEDATE: ");
			Date WORKDONEDATE = ScannerUtil.readDate(s," errorMessage");
			System.out.println("WORKDONEDESCRIPTION: ");
			String WORKDONEDESCRIPTION = ScannerUtil.readString(s, "errorMessage");
			System.out.println("WORKDONESTATUS: ");
			String WORKDONESTATUS = ScannerUtil.readString(s, "errorMessage");
			p.createworkdone(WORKDONEID, EMPLOYEEID, MODULEID, WORKDONEDATE, WORKDONEDESCRIPTION, WORKDONESTATUS);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void login() {
		try {
			System.out.println("Account: ");
			String account =ScannerUtil.readString(s, "errorMessage");
			System.out.println("Firstname: ");
			String firstname =ScannerUtil.readString(s, "errorMessage");
			System.out.println("Lastname: ");
			String lastname =ScannerUtil.readString(s, "errorMessage");
			System.out.println("Email: ");
			String email =ScannerUtil.readString(s, "errorMessage");
			p.login(account, firstname, lastname, email);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
