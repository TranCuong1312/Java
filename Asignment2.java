package Test;

import java.util.Random;


public class Asignment2 {

	private static final String ArrayUtils = null;

	public static void main(String[] args) {
		
		String[] Ho= {"North","South","West","East","NoWhere","Central","Pole"};
		String[] TenDem= {" In The "," On The "," From The "," Far From The "," Close To The "," In The End Of "," Under The "};
		String[] Ten= {"North","South","West","East","NoWhere","Central","Pole"};
		
		
		
		
		
		
		
		int ID[]={1,2,3,4,5,6,7};
		
		String[] Brithday= {"1/1/1999","2/2/1999","3/3/1999","4/4/1999","5/5/1999","6/6/1999","7/7/1999"};
		
		String[] name = new String[10];
		Random random= new Random();
		 for(int i=0;i<name.length;i++) {
			 int randomHo=random.nextInt(Ho.length);
			 int randomTenDem=random.nextInt(TenDem.length);
			 int randomTen=random.nextInt(Ten.length);
			 name[i] =Ho[randomHo]+TenDem[randomTenDem]+Ten[randomTen];
			 System.out.println(name[i]);
		 }
		
		
		
		
		
		
		String[] Info= new String[10];
		for(int i=0;i<name.length;i++) {
			int randomname=random.nextInt(name.length);
			int randomID=random.nextInt(ID.length);
			int randombrithday=random.nextInt(Brithday.length);
			Info[i]=name[randomname]+"    "+ID[randomID]+"    "+Brithday[randombrithday];
			System.out.println(Info[i]);
		}
		
		
	}

}
