package A6;

import java.util.Scanner;

public class salary {
	
	public enum professorornot {
		yeahh, nahh
	}
	public static void main(String[] args) {
		
		worker w =new worker();
		w.workerinformation();
		Scanner s =new Scanner(System.in);
		System.out.println("1-professor; 2-notprofessor");
		System.out.println("Nhap loai nghe nghiep: ");
		int job =s.nextInt();
		if(job==1){
				professor p = new professor();
				p.workerinformation();
				p.allowance();
				p.salary();
				p.print();
		}else {
				notprofessor wwnp = new notprofessor();
				wwnp.workerinformation();
				wwnp.allowance();
				wwnp.salary();
				wwnp.print();
		}
	}

}
