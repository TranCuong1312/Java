package A6;

import java.util.Scanner;
/**
 * 
 * @author Admin
 *
 */
//
public class worker {
	String fullname;
	int salarymultiplier;
	int job;
	Scanner s = new Scanner(System.in);
	
	public void workerinformation() {
		System.out.println("Nhap fullname: ");
		fullname = s.nextLine();
		System.out.println("Nhap salarymultiplier: ");
		salarymultiplier=s.nextInt();
	}
}
