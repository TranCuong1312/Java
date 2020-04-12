package Asignment8part1;

public class Drone extends AllBees{
	public Drone(){
		super();
	}
	
	@Override
	public void CheckHealthStatus(){
		System.out.println("\t\t:dronehealth: ");
	    super.CheckHealthStatus();	
	    if(floatingPointHealth < 50){
	    	System.out.println("\t\tBee dead and can't fly");
	    }
	}
}