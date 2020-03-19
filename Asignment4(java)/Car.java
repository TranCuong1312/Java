package Test;

public class Car {
	
	int speed;
	double regularPrice=10000;
	String color;
	
	Car(double regularPrice){
		this.regularPrice=regularPrice;
	}
	
	double getSalePrice() {
		System.out.println(regularPrice);
		return regularPrice;
	}
}
