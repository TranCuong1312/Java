package Asignment8part1;

public class Worker extends AllBees {
	public Worker() {
		super();
	}

	
	@Override
	public void check() {
		System.out.println("Queen:");
		super.check();
		if (floatingPointHealth < 70) {
			System.out.println("Death!");
		}
	}
}
