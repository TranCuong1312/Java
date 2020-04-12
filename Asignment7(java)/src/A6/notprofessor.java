package A6;

import java.util.List;
import java.util.Scanner;

public class notprofessor extends worker{
	private String department;
	private int workingTime;
	private String position;
	Scanner scanner =new Scanner(System.in);
	
	
	public void input(){
		super.input();
		System.out.println("Enter the other information of Officials: ");
		
		
		System.out.println("department: ");
		scanner.nextLine();
		this.department = scanner.nextLine();
		
		
		System.out.println("workingTime: ");
		this.workingTime = scanner.nextInt();
		
		
		System.out.println("position (departmentHead/ viceHead/ staff): ");
		scanner.nextLine();
		
		String positionEnter = scanner.nextLine();
		
		while (!positionEnter.equals("departmentHead") && !positionEnter.equals("viceHead") && (!positionEnter.equals("staff"))){
			System.out.println("Invalid value, enter again!");
			positionEnter = scanner.nextLine();
		} 
		
		this.position = positionEnter;
	}

	
	
	public String getDepartment(){
		return department;
	}
	
	
	public int getWorkingTime(){
		return workingTime;
	}
	
	
	public String getPosition(){
		return position;
	}
	
	
	@Override
	public float getSalary() {
		salary = salaryMultiplier * 730 + allowance + workingTime * 30;
		return salary;
	}
	
	
	
	public void print(){
		super.print();
		System.out.println("Department: " + this.department);
		System.out.println("Working Time: " + this.workingTime);
		System.out.println("Position: " + this.position);
		System.out.println("Salary:" + this.getSalary());
	}
	
	
	public static void searchStaff (List<notprofessor> listnp, String nameSearch, String departmentSearch){
		for (int i = 0; i < listnp.size(); i++) {
			if ((listnp.get(i).fullName.equals(nameSearch)) && (listnp.get(i).getDepartment().equals(departmentSearch))){
				listnp.get(i).print();
			}
		}		
	}
}
