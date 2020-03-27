package Asignment8part1;

public class Drone extends AllBees {
	public Drone() {
		super();
	}

	
	@Override
	public void check() {
		System.out.println("Drone: ");
		super.check();
		if (floatingPointHealth < 50) {
			System.out.println("Death!");
		}
	}
}