package PresentationLayer;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import BussinessLayer.Buss2;
import BussinessLayer.iBuss2;

public class Present2 {

	private iBuss2 b2;
	
	public Present2() {
		b2 =new Buss2();
	}
	
	public void create(String firstname, String lastname, String phone, String email, String pass, String project,
			String proskill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		boolean ys1, ys2, ys3;
		String phonepattern="{9,12}";
		String emailpattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		ys1=phone.matches(phonepattern);
		if(!ys1) {
			System.out.println("Phone not matche");	
		}
		ys2= email.matches(emailpattern);
		if(!ys2) {
			System.out.println("Email not matche");
		}
		
		b2.create(firstname, lastname, phone, email, pass, project, proskill);
	}

	
	public void login(String email, String pass)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		b2.login(email, pass);
	}
}
