package A6;

import java.util.Scanner;
/**
 * 
 * @author Admin
 *
 */
//
public abstract class worker {
	protected String fullName;
	protected float salaryMultiplier;
	protected int allowance;
	protected float salary;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void input(){
		System.out.println("Enter some information of employee: ");
		
		System.out.println("fullName: ");
		this.fullName = scanner.nextLine();
		
		System.out.println("salaryMultiplier: ");
		this.salaryMultiplier = scanner.nextFloat();
		
		System.out.println("allowance: ");
		System.out.println("Bachelor: 300, Master: 500, Doctor: 1000, Department head: 2000, "
				+ "Vice head: 1000, Staff: là 500.");
		int allowanceEnter = scanner.nextInt();
		while ((allowanceEnter != 300) && (allowanceEnter != 500) && (allowanceEnter != 1000) && (allowanceEnter != 2000)){
			System.out.println("Invalid value. Please enter again!");
			allowanceEnter = scanner.nextInt();
		}
		this.allowance = allowanceEnter;
	}
	
	
	public void print(){
		System.out.println("Full name: " + this.fullName);
		System.out.println("Salary Multiplier: " + this.salaryMultiplier);
		System.out.println("Allowance: " + this.allowance);
	}
	
	
	public abstract float getSalary();
	
	
	
	
}
