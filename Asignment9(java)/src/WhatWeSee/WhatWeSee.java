package WhatWeSee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import PresentationLayer.Controller;
import User.Trainess;
import Utils.ScannerUtils;

public class WhatWeSee {
	 
	 static List<Trainess> trs= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatWeSee wws=new WhatWeSee();
		Scanner s=new Scanner(System.in);
		int c;
		while(true) {
			String account="";
			String firstname="";
			String lastname="";
			String email="";
			System.out.println("Account: ");
			account=ScannerUtils.readString(s,"Fill it");
			System.out.println("FirstName: ");
			firstname=ScannerUtils.readString(s,"Fill it");
			System.out.println("LastName: ");
			lastname=ScannerUtils.readString(s, "Fill it");
			System.out.println("Email: ");
			email=ScannerUtils.readString(s, "Fill it");
			boolean b= new Controller().login(account, firstname, lastname, email);
			if(!b) {
				System.out.println("You fail!");
			} else {
				System.out.println("You made it!");
				boolean login =true;
				while(login) {
					System.out.println("Wellcome to JusticeLeague");
					System.out.println("1-Insert");
					System.out.println("2-Update");
					System.out.println("3-Exit");
					c=ScannerUtils.readInt(s, "You have to");
					switch(c) {
					case 1:
						wws.insert();
						break;
					case 2:
						wws.update();
					case 3:
						login=false;
						System.out.println("Out");
					default:
						System.out.println("Read the line!!!!");
					}
				}
			}
		}
	}
	
	private void update() {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		Trainess tr=new Trainess();
		System.out.println("Account: ");
		tr.setAccount(ScannerUtils.readString(s, "Fill it!!!"));
		System.out.println("FirstName: ");
		tr.setFirstName(ScannerUtils.readString(s, "Fill it!!!"));
		System.out.println("LastName: ");
		tr.setLastName(ScannerUtils.readString(s, "Fill it!!!"));
		System.out.println("Email: ");
		tr.setEmail(ScannerUtils.readString(s, "Fill it!!!"));
		boolean b=new Controller().update(tr);
		if(!b) {
			System.out.println("You Fail!!!");
		}else {
			System.out.println("Success, dude");
		}
	}

	private void insert() {
		Scanner s=new Scanner(System.in);
		Trainess tr=new Trainess();
		System.out.println("Account: ");
		tr.setAccount(ScannerUtils.readString(s, "Fill it!!!!"));
		System.out.println("FirstName: ");
		tr.setFirstName(ScannerUtils.readString(s, "Fill it!!!"));
		System.out.println("LastName: ");
		tr.setLastName(ScannerUtils.readString(s, "Fill it!!!"));
		System.out.println("Email: ");
		tr.setEmail(ScannerUtils.readString(s, "Fill it!!!"));
		boolean b=new Controller().insert(tr);
		if(!b) {
			System.out.println("You Fail!!!");
		}else {
			System.out.println("Success, bro");
		}
	}

}
