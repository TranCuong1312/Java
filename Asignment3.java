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
			 
		 }
		
		
		
		
		
		
		String[] Info= new String[10];
		for(int i=0;i<name.length;i++) {
			int randomname=random.nextInt(name.length);
			int randomID=random.nextInt(ID.length);
			int randombrithday=random.nextInt(Brithday.length);
			Info[i]=name[randomname]+"    "+ID[randomID]+"    "+Brithday[randombrithday];
			
		}
	System.out.println("-------------------------------------------------||--||--||--||--||--||");	
	Integer[] Javamark= new Integer[10];
	Integer[] CodingAndTest= new Integer[10];
	Integer[] ManagemetTools= new Integer[10];
	Integer[] Analysis= new Integer[10];
	Integer[] Design= new Integer[10];
	
	for(int i =0;i<9;i++) {
		int randommark= random.nextInt((10 - 0)+1+0);
		Javamark[i]=randommark;
		CodingAndTest[i]=randommark;
		ManagemetTools[i]=randommark;
		Analysis[i]=randommark;
		Design[i]=randommark;
		for(int j=0;j<i-1;j++) {
			if (Javamark[i].equals(Javamark[j])&Javamark[i]==0) {
				i=i-1;
				continue;
			}else if(Javamark[i].equals(Javamark[j])&Javamark[i]==8){
				i=i-1;
				continue;
			}else if(Javamark[i].equals(Javamark[j])&Javamark[i]==9){
				i=i-1;
				continue;
			}else if(Javamark[i].equals(Javamark[j])&Javamark[i]==10){
				i=i-1;
				continue;
			}else for(int k=0;k<j-1;k++) {
				if(Javamark[i].equals(Javamark[j])&Javamark[j].equals(Javamark[k])&Javamark[k]==1){
					i=i-1;
					continue;
				}else if(Javamark[i].equals(Javamark[j])&Javamark[j].equals(Javamark[k])&Javamark[k]==2){
					i=i-1;
					continue;
				}
				
			}
				
		}
		
		System.out.println(Info[i]+"             "+Javamark[i]+" "+CodingAndTest[i]+" "+ManagemetTools[i]+" "+Analysis[i]+" "+Design[i]);
		}
	int diem[]= {0,1,2,3,4,5,5,6,7,9};
	for(int i=0;i<name.length;i++) {
		int randomdiem=random.nextInt(name.length);
		Javamark[i]=randomdiem;
	}

	for(int i=0;i<name.length;i++) {
		int randomdiem=random.nextInt(name.length);
		CodingAndTest[i]=randomdiem;
	}
	
	for(int i=0;i<name.length;i++) {
		int randomdiem=random.nextInt(name.length);
		ManagemetTools[i]=randomdiem;
	}
	
	for(int i=0;i<name.length;i++) {
		int randomdiem=random.nextInt(name.length);
		Analysis[i]=randomdiem;
	}
	
	for(int i=0;i<name.length;i++) {
		int randomdiem=random.nextInt(name.length);
		Design[i]=randomdiem;
	}
	String Info2[]=new String[10];
	for(int i =0;i<name.length;i++) {
		int randominfo = random.nextInt(name.length);
		System.out.println(Info2[i]=Info[randominfo]+" "+Javamark[i]+" "+ManagemetTools[i]+" "+CodingAndTest[i]+" "+Design[i]+" "+Analysis[i]);
	}
	}
	
	

	
	}


