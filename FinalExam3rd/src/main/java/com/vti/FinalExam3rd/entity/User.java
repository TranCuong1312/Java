//
package com.vti.FinalExam3rd.entity;

import java.util.Scanner;

import com.vti.FinalExam3rd.utils.ScannerUtil;



public class User {
	private int uId;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;

	public User() {
		super();
	}

	public User(int uId,String firstName, String lastName, String phone, String email, String password) {
		super();
		this.uId=uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	

	public int getUId() {
		return uId;
	}

	public void setUId(int uId) {
		this.uId = uId;
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("FirstName:");
		firstName=ScannerUtil.readString(sc, "Mời bạn nhập vào 1 chuỗi! \nVui lòng nhập lại: ");
		System.out.println("LastName:");
		lastName=ScannerUtil.readString(sc, "Mời bạn nhập vào 1 chuỗi! \nVui lòng nhập lại: ");
		System.out.println("Phone:");
		phone=ScannerUtil.readPhone(sc, "Mời bạn nhập vào 1 chuỗi! \nVui lòng nhập lại: ");
		System.out.println("Email:");
		email=ScannerUtil.readEmail(sc, "Mời bạn nhập vào 1 chuỗi! \nVui lòng nhập lại: ");
		System.out.println("Password:");
		password=ScannerUtil.readPassword(sc, "Mời bạn nhập vào 1 chuỗi! \nVui lòng nhập lại: ");
	}

}
