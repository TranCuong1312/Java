//
package com.vti.FinalExam3rd.frontend;

import java.util.Scanner;

import com.vti.FinalExam3rd.utils.ScannerUtil;

public class Program {

	public static void main(String[] args) {
		Function f = new Function();
		Scanner sc = new Scanner(System.in);
		int choose;
		int choose1;
		while (true) {
			System.out.println("_____________________________");
			System.out.println("|_____Signup___|____Login___|");
			System.out.println("|________1_____|______2_____|");
			choose = ScannerUtil.readInt(sc, "1-2, please: ");
			switch (choose) {
			case 1:
				boolean bl = true;
				while (bl) {
					System.out.println("__________________________________");
					System.out.println("|__Manager__|__Emplyee__|__Back__|");
					System.out.println("|_____1_____|_____2_____|____3___|");
					choose1 = ScannerUtil.readInt(sc, "1-3, please: ");
					if (choose1 == 1) {
						f.createManager();

					} else if (choose1 == 2) {
						f.createEmployee();

					} else if (choose1 == 3) {
						bl = false;

					} else {
						System.out.println("1-3");
					}
					break;
				}
				break;

			case 2:
				f.Login();
				break;
			default:
				System.out.println("1-2");
				break;
			}
		}

	}

}
