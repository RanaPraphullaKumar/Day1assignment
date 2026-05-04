package com.assignment.Day1assignment;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("Zero");
		}
		else if(num % 2 == 0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
