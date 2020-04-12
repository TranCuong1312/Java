package Asignment8part1;

public class AllBees {
	protected int floatingPointHealth;
	
	public AllBees(){
		this.floatingPointHealth = 100;
	}
	
	public void Damage(int dame){
		if (dame >=0 && dame <= 100){
			floatingPointHealth -= dame;
			if (floatingPointHealth < 0){
				floatingPointHealth = 0;
			}
		}
	}
	
	public void CheckHealthStatus(){
		System.out.println("\t\tfloatingPointHealth = " + floatingPointHealth );		
	}

}
	
	
