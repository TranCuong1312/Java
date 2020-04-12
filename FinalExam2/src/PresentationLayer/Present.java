package PresentationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import BussinessLayer.Buss;
import BussinessLayer.iBuss;

public class Present {
	private iBuss b;
	
	public Present() {
		b =new Buss();
	}
	
	public void create(String firstname, String lastname, String phone, String email, String pass, int expinyear)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		boolean ys1, ys2, ys3;
		String phonepattern="{9,12}";
		String emailpattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		int expinyearpattern =20;
		ys1=phone.matches(phonepattern);
		if(!ys1) {
			System.out.println("Sorry, bro!");	
		}
		ys2= email.matches(emailpattern);
		if(!ys2) {
			System.out.println("Sorry, bro!");
		}
		ys3 = expinyear <expinyearpattern;
		if(!ys3) {
			System.out.println("Sorry, bro!");
		}
		b.create(firstname, lastname, phone, email, pass, expinyear);
	}
	
	public void login(String email, String pass)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		b.login(email, pass);
	}

}
