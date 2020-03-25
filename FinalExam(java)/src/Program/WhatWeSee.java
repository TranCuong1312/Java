package Program;

import java.util.Scanner;

import Enity.Employee;
import Enity.manager;
import PrenetationLayer.Controller;
import PrenetationLayer.Controller2;
import Utils.ScannerUtils;

public class WhatWeSee {
	/* This class is .
	*
	* @Description: .
	* @author: ManhCuong
	* @create_date: ${date}
	* @version: 1.0
	* @modifer: ManhCuong
	* @modifer_date: ${date}
	* ${tags}
	*/
	public static void main(String[] args) {
		WhatWeSee wws=new WhatWeSee();
		Scanner s=new Scanner(System.in);
		System.out.println("Phan loai: ");
		int d;
		int c = s.nextInt();
		if(c==1) {
		while(true) {
			String FirstName="";
			String LastName="";
			String Phone="";
			String Email="";
			int ExpInYear;
			System.out.println("First name: ");
			FirstName=ScannerUtils.readString(s, "Fill it!!!");
			System.out.println("LastName: ");
			LastName=ScannerUtils.readString(s, "Fill it!!!");
			System.out.println("Phone: ");
			Phone=ScannerUtils.readString(s, "Fill it!!!");
			System.out.println("Email: ");
			Email=ScannerUtils.readString(s, "Fill it!!!");
			System.out.println("Experience In Year: ");
			ExpInYear=ScannerUtils.readInt(s, "Fill it!!!");
			boolean b =new Controller().register(FirstName, LastName, Phone, Email, ExpInYear);
			if(!b) {
				System.out.println("Great, you have to do it again or just leave.");
			}else {
				System.out.println("You made it!!!");
				boolean register =true;
				while(register) {
					System.out.println("Wellcome to Justice League");
					System.out.println("1-You want to login");
					System.out.println("2-You need to login");
					System.out.println("3-You have to login");
					d=ScannerUtils.readInt(s, "Choose or leave");
					switch(d) {
					case 1:
						wws.login();
						break;
					case 2:
						wws.login();
						break;
					case 3:
						wws.login();
						break;
					default:
						System.out.println("You are nothing, you not a part of Justice League");
					}
				}
			}
		}
		} else {
			while(true) {
				String FirstName="";
				String LastName="";
				String Phone="";
				String Email="";
				String ProjectName="";
				String ProSkill="";
				System.out.println("First name: ");
				FirstName=ScannerUtils.readString(s, "Fill it!!!");
				System.out.println("LastName: ");
				LastName=ScannerUtils.readString(s, "Fill it!!!");
				System.out.println("Phone: ");
				Phone=ScannerUtils.readString(s, "Fill it!!!");
				System.out.println("Email: ");
				Email=ScannerUtils.readString(s, "Fill it!!!");
				System.out.println("ProjectName: ");
				ProjectName=ScannerUtils.readString(s, "Fill it!!!");
				System.out.println("ProSkill: ");
				ProSkill=ScannerUtils.readString(s, "Fill it!!!");
				boolean b =new Controller2().register(FirstName, LastName, Phone, Email, ProjectName, ProSkill);
				if(!b) {
					System.out.println("Great, you have to do it again or just leave.");
				}else {
					System.out.println("You made it!!!");
					boolean register =true;
					while(register) {
						System.out.println("Wellcome to Justice League");
						System.out.println("1-You want to login");
						System.out.println("2-You need to login");
						System.out.println("3-You have to login");
						d=ScannerUtils.readInt(s, "Choose or leave");
						switch(d) {
						case 1:
							wws.login2();
							break;
						case 2:
							wws.login2();
							break;
						case 3:
							wws.login2();
							break;
						default:
							System.out.println("You are nothing, you not a part of Justice League");
						}
					}
				}
			}
		}
	}
	/* This class is .
	*
	* @Description: .
	* @author: ManhCuong
	* @create_date: ${date}
	* @version: 1.0
	* @modifer: ManhCuong
	* @modifer_date: ${date}
	* ${tags}
	*/
	private void login2() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Email: ");
		e.setEmail(ScannerUtils.readString(s, "Wrong"));
		System.out.println("FirstName-PassWord: ");
		e.setFirstName(ScannerUtils.readString(s, "Wrong"));
	}

	private void login() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		manager m=new manager();
		System.out.println("Email: ");
		m.setEmail(ScannerUtils.readString(s, "Wrong"));
		System.out.println("FirstName-PassWord: ");
		m.setFirstName(ScannerUtils.readString(s, "Wrong"));
	}
}
