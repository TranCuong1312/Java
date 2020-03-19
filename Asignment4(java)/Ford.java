package Test;

public class Ford extends Car{
	int realPrice;
	int year;
	int manufacturerDiscount;
	Ford(int manufacturerDiscount,double regularPrice){
		super(regularPrice);
		this.manufacturerDiscount=manufacturerDiscount;
	}
	double getSalePrice() {
		realPrice=(int)(regularPrice-manufacturerDiscount);
		System.out.println("Ford: "+realPrice);
		return realPrice;
	}
}
