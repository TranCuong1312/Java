package A6;

import java.util.Scanner;

public class professor extends worker {
	

	private String faculty;
	private String academicDegree;
	private int monthlyTeachingTime;

	Scanner scanner = new Scanner(System.in);

	
	public void input() {
		super.input();
		System.out.println("Enter the other information of professor: ");

	
		System.out.println("faculty: ");
		scanner.nextLine();
		this.faculty = scanner.nextLine();

	
		scanner.nextLine();
		System.out.println("academicDegree (bachelor/ master/ doctor):");
		
		String academicDegreeEnter = scanner.nextLine();
		
		while ((!academicDegreeEnter.equals("bachelor")) && (!academicDegreeEnter.equals("master"))
				&& (!academicDegreeEnter.equals("doctor"))) {
			System.out.println("Invalid value, please enter again!");
			academicDegreeEnter = scanner.nextLine();
		}
		this.academicDegree = academicDegreeEnter;
		
		
		System.out.println("monthlyTeachingTime: ");
		this.monthlyTeachingTime = scanner.nextInt();
	}

	
	public int getMonthlyTeachingTime() {
		return monthlyTeachingTime;
	}

	
	public float getSalary() {
		salary = salaryMultiplier * 730 + allowance + monthlyTeachingTime * 45;
		return salary;
	}

	
	public void print(){
		super.print();
		System.out.println("Faculty: " + this.faculty);
		System.out.println("Academic Degree: " + this.academicDegree);
		System.out.println("Monthly Teaching Time" + this.monthlyTeachingTime);
		System.out.println("Salary:" + this.getSalary());
	}
	
	
	public String getSortedName(String nameProfessor) {

		String result;
		String[] names = nameProfessor.split(" ");
		String firstName, lastName;
		String middleName = "";

		firstName = names[0];
		lastName = names[names.length - 1];
		for (int i = 1; i < names.length - 1; i++) {
			middleName = middleName + " " + names[i];
		}

		result = lastName + " " + firstName  + " " + middleName;
		return result;

	}
}
