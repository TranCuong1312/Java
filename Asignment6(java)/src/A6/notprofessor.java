package A6;

public class notprofessor extends worker{
	public static Object positon;
	private String department;
	private int workingtime;
	enum position {
		bachelorhead, vicehead, staff;
	};
	private int salary, allowance;
	
	public void workerinformation() {
		System.out.println("Nhap department: ");
		department = s.nextLine();
		System.out.println("Nhap workingtime: ");
		workingtime = s.nextInt();
	}
	
	public int allowance() {
		System.out.println("1-Bacherlorhead; 2-Vicehead; 3-staff");
		System.out.println("Nhap chuc vu: ");
		int c =s.nextInt();
		if(c>3 ||c<1) {
			allowance();
		}if(c==1) {
			allowance =2000;
		}if(c==2) {
			allowance=1000;
		}if(c==3) {
			allowance=500;
		}
		return allowance;
	}
	
	public int salary() {
		salary = salarymultiplier*730 +allowance+workingtime*30;
		return salary;
	}
	void print() {
		System.out.println("Salary: "+salary);
	}
	

}
