package Test;

public class Sedan extends Car {
	int realPrice;
	int length;
	Sedan(int length, double regularPrice){
		super(regularPrice);
		this.length=length;
	}
	
	double getSalePrice() {
		if(length>20) {
			realPrice=(int) (regularPrice*95/100);
		}else {
			realPrice=(int) (regularPrice*90/100);
		}
		System.out.println("Sedan: "+this.realPrice);
		return realPrice;
	}
}
