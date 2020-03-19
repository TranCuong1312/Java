package Test;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sedan=new Sedan(20,40000);
		sedan.getSalePrice();
		
		Ford ford1=new Ford(20000,50000);
		ford1.getSalePrice();
		
		Ford ford2=new Ford(10000,60000);
		ford2.getSalePrice();
		
		Car car=new Car(10000.0);
		car.getSalePrice();
		
	}
}