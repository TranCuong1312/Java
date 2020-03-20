package Asignment5part2;

import Asignment5.Employee;

public abstract class BonusEmployees extends Employee{
	void bonus(int bonus, String name) {
		System.out.println(name+bonus);
	}
}
