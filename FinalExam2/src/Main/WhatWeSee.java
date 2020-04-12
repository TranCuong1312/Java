package Main;

import java.util.Scanner;

public class WhatWeSee {
	public static void main(String arg[]) {
		Function function = new Function();
		Function2 function2 = new Function2();
		Scanner s = new Scanner(System.in);
		System.out.println("Please choose");
		System.out.println("1, Manager sign up");
		System.out.println("2, Employee sign up");
		System.out.println("3, Manager log in");
		System.out.println("4, Employee log in");
		int choose = s.nextInt();
		switch(choose) {
		case 1:
			function.create();
			break;
		case 2:
			function2.create();
			break;
		case 3:
			function.login();
			break;
		case 4:
			function2.login();
			break;
		default:
			System.out.println("Restart");
		}
	}
}
