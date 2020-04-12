/**
 * 
 */
package Asignment8part1;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class ScannerUtils {
	public static String readString(Scanner s, String errorMessage) {
		while(true) {
			try {
				String result= s.nextLine().trim();
				if(result != null & !result.isEmpty()) {
					return result;
				}
			}catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readInt(Scanner s, String errorMessage) {
		while(true) {
			try {
				return Integer.parseInt(s.nextLine());
			}catch(Exception e) {
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
	/**
	 * @param errorMessage
	 */
	private static void showError(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error: "+message);
	}
}
