package Asignment8part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Asignment8part1.AllBees;;

public class WhatWeSee {
	static List<AllBees> bees= new ArrayList<>();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choose;

		WhatWeSee wws = new WhatWeSee();
		while (true) {
			System.out.println("1.	Create random Bee list.");
			System.out.println("2.	Attack Bee.");
			System.out.println("3.	Exit.");
			choose = ScannerUtils.readInt(sc, "Stop messing around");

			switch (choose) {
			case 1:
				wws.createBeeList();
				break;
			case 2:
				if (bees == null) {
					System.out.println("PLEASE CREATE LIST BEE FIRST!");
					break;
				} else {
					wws.attack();
					wws.show();
					break;
				}
			case 3:
				System.exit(0);
			default:
				System.out.println("PLEASE CHOOSE FROM 1 --> 3!");
				break;
			}

		}

	}

	private void show() {
		int i = 1;
		for (AllBees bee : bees) {
			System.out.println("\tBee " + i);
			i++;
			((AllBees) bees).check();
		}
	}

	private void attack() {
		for (AllBees bee : bees) {
			((AllBees) bees).damage(new Random().nextInt(81));
		}
		System.out.println("SUCCESS!");
		System.out.println("-----------------------------------------");
		System.out.println();
	}

	private void createBeeList() {
		bees = new ArrayList<>();
		int rnd = new Random().nextInt(11);
		int rnd1 = new Random().nextInt(11 - rnd);
		int rnd2 = 10 - (rnd1 + rnd);
		for (int i = 0; i < rnd; i++) {
			Worker bee = new Worker();
			bees.add(bee);
		}
		for (int i = 0; i < rnd1; i++) {
			Drone bee = new Drone();
			bees.add(bee);
		}
		for (int i = 0; i < rnd2; i++) {
			Queen bee = new Queen();
			bees.add(bee);
		}
		 Collections.shuffle(bees);
		System.out.println("SUCCESS!");
	}
}