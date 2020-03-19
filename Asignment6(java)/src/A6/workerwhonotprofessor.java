package A6;

public class workerwhonotprofessor extends worker {
	private String department;
	private int workingtime;
	enum position{ departmenthead, vicehead, staff};
	private int salary, allowance;
	
	@Override
	public void workerinformation{
		super.workerinformation();
		System.out.println("Nhap department: ");
		department =s.nextLine();
		System.out.println("Nhap working time: ");
		workingtime = s.nextInt();
	}
	
	public int salary() {
		salary = salarymultiplier * 730 + allowance + workingtime*30;
		return salary;
	}
}