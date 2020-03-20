package A6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class salary {
	
	public enum professorornot {
		yeahh, nahh
	}
	public static void main(String[] args) {
		int n, tk;
		int[] job = new int[n];
		System.out.println("Nhap so worker: ");
		Scanner s= new Scanner(System.in);
		n =s.nextInt();
		// Tao chuoi worker
		worker[] w =new worker[n];
		for(int i=0;i<n;i++) {
			System.out.println("Number: "+(i+1));
			//Khoi tao worker
			System.out.println("1-professor; 2-notprofessor");
			System.out.println("Nhap loai nghe nghiep: ");
			job[i] =s.nextInt();
			if(job[i]==1){
				professor w[i] = new professor();
				w[i].workerinformation();
				w[i].allowance();
				w[i].salary();
				w[i].print();
			}else {
				notprofessor w[i] = new notprofessor();
				w[i].workerinformation();
				w[i].allowance();
				w[i].salary();
				w[i].print();
			}
		}
		System.out.println("Danh sach worker: ");
		for(int i=0;i<n;i++) {
			System.out.println("Worker so: "+(i+1));
			System.out.println(w[i].fullname + w[i].salarymultiplier);
			if(job[i] == 1) {
				System.out.println("Professor");
				
			}
		}
		
	}

}
