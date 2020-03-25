package BussinessLayer;

import DataLayer.Data;
import DataLayer.interfaceData;

public class Buss implements interfaceBuss {
	private interfaceData da;
	public Buss() {
		da=new Data();
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
	public boolean register(String FirstName, String LastName, String Phone, String Email, int ExpInYear) {
		// to data
		
		return da.register(FirstName, LastName, Phone, Email, ExpInYear);
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
	public boolean login(String FirstName, String Email) {
		// TO data
		return da.login(FirstName, Email);
	}

}
