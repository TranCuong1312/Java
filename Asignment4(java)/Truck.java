package Test;

public class Truck extends Car {
	int price;
	int weight;
	Truck(int weight,double regularPrice){
		super(regularPrice);
		this.weight=weight;
	}
	double getSalePrice() {
		if (weight>1000) {
			price=(int) (regularPrice*9/10);
		} else {
			price=(int) (regularPrice*8/10);
		}
		System.out.println(price);
		return price;
	}
}
