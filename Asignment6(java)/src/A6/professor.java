package A6;

public class professor extends worker {
	private String faculty;
	public enum academydegree {bachelor, master, doctor};
	private int monthlyteachingtime;
	private int salary, allowance;
	
	@Override
	public void workerinformation() {
		 System.out.println("Nhap faculty: ");
		 faculty = s.nextLine();
		 System.out.println("Nhap Monthly teaching time: ");
		 monthlyteachingtime=s.nextInt();
	}
	
	public int allowance() {
		System.out.println("1-Bachelor; 2-Master; 3-Doctor");
		System.out.println("Nhap chuc vu: ");
		int c =s.nextInt();
		if(c>3 ||c<1) {
			allowance();
		}if(c==1) {
			allowance =300;
		}if(c==2) {
			allowance=500;
		}if(c==3) {
			allowance=1000;
		}
		return allowance;
	}
	
	public int salary() {
		salary =salarymultiplier*730 +allowance+monthlyteachingtime*45;
		return salary;
	}
	
	void print() {
		System.out.println("Salary: "+ salary);
	}
}
