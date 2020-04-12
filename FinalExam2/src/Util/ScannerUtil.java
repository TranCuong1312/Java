package Util;


import java.sql.Date;
import java.util.Scanner;

import com.mysql.cj.util.StringUtils;



public class ScannerUtil {

	
	public static int readInt(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static Date readDate(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Date.valueOf(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	
	public static double readDouble(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	
	public static float readFloat(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	
	public static String readString(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				String result = scanner.nextLine().trim();
				if (!StringUtils.isNullOrEmpty(result)) {
					return result;
				}
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	
	private static void showError(String message) {
		System.out.println("Error: " + message);
	}

}
