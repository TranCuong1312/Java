package Asignment8part1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class WhatWeSee {
	
	static List<AllBees>bees;
	
	private void createBeeList(){
		bees = new ArrayList<>();
		int rnd = new Random().nextInt(11);
		int rnd1 = new Random().nextInt(11-rnd);
		int rnd2 = 10-(rnd + rnd1);
		for(int i=0; i<rnd; i++){
			Worker bee = new Worker();
			bees.add(bee);
		}
		for(int i=0; i<rnd1; i++){
			Queen bee = new Queen();
			bees.add(bee);
		}
		for(int i=0; i<rnd2; i++){
			Drone bee = new Drone();
			bees.add(bee);
		}
		Collections.shuffle(bees);
		System.out.println("CREATE SUCCESSFULLY!");			
	}
	
	private void attackBee(){
		for (AllBees bee : bees) {
			bee.Damage(new Random().nextInt(81));
		}
		System.out.println("ATTACK SUCCESSFULLY!");
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
	private void statusBee(){
		int i = 1;
		for (AllBees bee : bees) {
			System.out.println("\tBee " + i);
			i++;
			bee.CheckHealthStatus();
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose;
		
		WhatWeSee obj = new WhatWeSee();
		
		while (true){
			System.out.println("1. Tao danh sach bee");
			System.out.println("2. Tan cong bee");
			System.out.println("3. Thoat");
			choose = ScannerUtils.readInt(sc,"Yeu cau nhap so nguyen! \t Vui long nhap lai!");
			switch(choose){
			case 1:
				obj.createBeeList();
				break;
			case 2:
				if (bees == null){
					System.out.println("Tao danh sach bee dau tien");
					break;
				}
				else {
					obj.attackBee();
					obj.statusBee();
					break;
				}								
			case 3:
				System.exit(0);
			default:
				System.out.println("Please choose: ");
				break;												
			}
		}
	}
	
	

}