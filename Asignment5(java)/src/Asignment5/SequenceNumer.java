package Asignment5;
import java.util.Arrays;
import java.util.Scanner;
public class SequenceNumer {

	public int n;
	public int a[];
	Scanner s = new Scanner(System.in);
	
	
	public void input() {
		System.out.println("Nhap so phan tu: ");
		n = s.nextInt();
		a= new int[n];
		try {
			for(int i=0; i<n; i++) {
				System.out.println("Nhap so thu " + i +" :");
				a[i]= s.nextInt();
			}
		} catch(Exception e) {
			System.out.println("Something go wrong");
		}
	}
	
	public void print() {
		System.out.println(Arrays.toString(a));
	}

	

	
}
