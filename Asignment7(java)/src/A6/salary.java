package A6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class salary {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*******MENU*********");
		System.out.println("1. Search staff by name and department");
		System.out.println("2. Sort list professors by name");
		
		System.out.println("Before entering your choice, please enter some information of list professor and list staff!");
		//Enter list professor:
		List<professor> listProfessors = new ArrayList<>();
		System.out.println("Enter number of professor:");
		int numberProfessor = ScannerUtil.readInt(scanner,"Please enter a int number! Enter again:");
		
		for (int i = 0; i < numberProfessor; i++) {
			listProfessors.add(new professor());
			System.out.println("Enter the information of listProfessor[" + (i+1) + "]");
			listProfessors.get(i).input();
		}
		
		//enter list staff:
		List<notprofessor> listnp = new ArrayList<>();
		System.out.println("Enter number of Staff:");
		int numberStaff = ScannerUtil.readInt(scanner,"Please enter a int number! Enter again:");
		
		for (int i = 0; i < numberStaff; i++) {
			listnp.add(new notprofessor());
			System.out.println("Enter the information of listStaffs[" + (i+1) + "]");
			listnp.get(i).input();
		}
		// print 2 list:
		System.out.println("***************************************");
		System.out.println("List professor: ");
		for (int j = 0; j < listProfessors.size(); j++) {
			System.out.println("----------------------------------------------");
			listProfessors.get(j).print();
		}
		System.out.println("***************************************");
		System.out.println("List np: ");
		for (int j = 0; j < listnp.size(); j++) {
			System.out.println("----------------------------------------------");
			listnp.get(j).print();
		}
		
		//enter the choice
		System.out.println("Okay. Now, please enter your choice: ");
		int choice = ScannerUtil.readInt(scanner,"Please enter a int number! Enter again:");
		
		
		if (choice == 1){
			System.out.println("Enter name and department of staff which you want to search");
			System.out.println("Name: ");
			String nameSearch = ScannerUtil.readString(scanner, "Please enter string, enter again!");
			scanner.nextLine();
			System.out.println("Department: ");
			String departmentSearch = ScannerUtil.readString(scanner, "Please enter string, enter again!");
			
			
			// call searchStaff method and print the result
			System.out.println("Information of staff who you want to search: ");
			notprofessor.searchStaff(listnp, nameSearch, departmentSearch);
			
			
		} else if (choice == 2){
			Collections.sort(listProfessors, new Comparator<professor>() {

				public int compare1(professor obj1, professor obj2) {
					return obj1.getSortedName(obj1.fullName).compareTo(obj2.getSortedName(obj2.fullName));
				}

				@Override
				public int compare(professor o1, professor o2) {
					// TODO Auto-generated method stub
					return 0;
				}

			});

			System.out.println("List professors after sorting by name: ");
			for (professor pr : listProfessors) {
				pr.print();
			}
		}
		
	}
}

