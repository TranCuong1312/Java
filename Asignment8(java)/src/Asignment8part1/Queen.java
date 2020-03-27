package Asignment8part1;

public class Queen extends AllBees {
	public Queen() {
		super();
	}

	
	@Override
	public void check() {
		System.out.println("Queen:");
		super.check();
		if (floatingPointHealth < 20) {
			System.out.println("Death!");
		}
	}
}