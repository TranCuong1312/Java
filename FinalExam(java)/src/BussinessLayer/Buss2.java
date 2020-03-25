package BussinessLayer;

import DataLayer.Data;
import DataLayer.Data2;
import DataLayer.interfaceData;
import DataLayer.interfaceData2;

public class Buss2 implements interfaceBuss2 {
	private interfaceData2 da2;
	public Buss2() {
		da2=new Data2();
	}
	/**
	* This class is .
	*
	* @Description: .
	* @author: ManhCuong
	* @create_date: ${date}
	* @version: 1.0
	* @modifer: ManhCuong
	* @modifer_date: ${date}
	* ${tags}
	*/
	@Override
	public boolean register(String FirstName, String LastName, String Phone, String Email, String ProjectName, String ProSkill) {
		// TO data2
		return da2.register(FirstName, LastName, Phone, Email, ProjectName, ProSkill);
	}
	/* This class is .
	*
	* @Description: .
	* @author: ManhCuong
	* @create_date: ${date}
	* @version: 1.0
	* @modifer: ManhCuong
	* @modifer_date: ${date}
	* ${tags}
	*/
	@Override
	public boolean login(String FirstName, String Email) {
		// TO data2
		return da2.login(FirstName,Email);
	}

}
