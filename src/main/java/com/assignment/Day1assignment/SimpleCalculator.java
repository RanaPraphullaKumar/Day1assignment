package com.assignment.Day1assignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Operation to Perform");
		String ope = sc.nextLine();
		int res =0;
		switch (ope) {
		case "+":
			res = num1 + num2;
			System.out.println( "Result of + is "+res);
			break;
		case "-":
			 res = num1 - num2;
			System.out.println("Result of - is "+res);
			break;
		case "*":
			 res = num1 * num2;
			System.out.println("Result of  * is "+res);
			break;
		case "/":
			 res = num1/num2;
			System.out.println("Result of / is "+res);
			break;
			
			

		default:
			 System.out.println("Invalid operation selected.");
			break;
		}
	}

}
