package PresentationLayer;

import java.util.Scanner;

import BussinessLayer.Buss;
import BussinessLayer.InterfaceBuss;
import User.Trainess;
import Utils.ScannerUtils;

public class Controller {
	private InterfaceBuss buss;
	boolean ys1, ys2;
	
	public Controller() {
		buss = new Buss();
	}

	public boolean login(String account, String firstname, String lastname, String email) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String accountpatern= " ^[a-z0-9._-]{3,15}$";
		String emailpattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		ys1=account.matches(accountpatern);
		if(!ys1) {
			account=ScannerUtils.readString(s, "Wrong");
		}
		ys2=email.matches(emailpattern);
		if(!ys2) {
			email=ScannerUtils.readString(s, "Wrong");
		}
		return buss.login(account,email);
	}

	public boolean update(Trainess tr) {
		// TODO Auto-generated method stub
		return buss.update(tr);
	}

	public boolean insert(Trainess tr) {
		// TODO Auto-generated method stub
		return buss.insert(tr);
	}

}
