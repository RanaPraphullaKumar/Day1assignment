package com.assignment.Day1assignment;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		double sal = sc.nextDouble();
		System.out.println("Enter Your Experience");
		double bonus = 0;
		int exp = sc.nextInt();
		if(exp < 1) {
			System.out.println("No Bonus");
		}
		else if(exp >= 1 && exp <=4) {
			bonus = sal * 0.05;
			sal = sal + bonus;
			System.out.println(bonus);
			System.out.println(sal);
		}
		else if(exp >= 5 && exp <=10) {
			bonus = sal * 0.10;
			sal = sal + bonus;
			System.out.println(bonus);
			System.out.println(sal);
		}
		else if(exp > 10) {
			bonus = sal * 0.20;
			sal = sal + bonus;
			System.out.println(bonus);
			System.out.println(sal);
		}
		else {
			System.out.println("No Bonus");
		}
		

	}

}
