//
package com.vti.FinalExam3rd.entity;

import java.util.Scanner;

import com.vti.FinalExam3rd.utils.ScannerUtil;



public class Employee {
	private User uId;
	private int eId;
	private String projectName;
	private String proSkill;

	enum eProjectName {
		TestingSystem(1), CRM(2), TimeSheet(3);

		private int value;

		eProjectName(int i) {
			this.value = i;
		}

		public static eProjectName getEByIndex(int value) {
			for (eProjectName d : eProjectName.values()) {
				if (d.value == value) {
					return d;
				}
			}
			return null;
		}

		public static eProjectName getEByValue(int value) {
			for (eProjectName d : eProjectName.values()) {
				if (d.value == value) {
					return d;
				}
			}
			return null;
		}
	}

	public Employee() {
		super();
	}

	public Employee(int eId,String projectName, String proSkill) {
		super();
		this.eId=eId;
		this.projectName = projectName;
		this.proSkill = proSkill;
	}
	
	

	public int getEId() {
		return eId;
	}

	public void setEId(int eId) {
		this.eId = eId;
	
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	
	}

	public User getUser() {
		return uId;
	}

	public void setUser(User uId) {
		this.uId = uId;
	
	}
	
	public void input(User uId) {
		Scanner sc = new Scanner(System.in);
		this.uId=uId;
		System.out.println("ProjectName:");
		projectName=ScannerUtil.readProjectName(sc, "Input a array, please. Again: ");
		System.out.println("ProSkill:");
		proSkill=ScannerUtil.readString(sc, "Come on , dude. Again: ");
	}
	
	
}
