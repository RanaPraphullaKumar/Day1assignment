package com.assignment.Day1assignment;

import java.util.Scanner;

public class Largest_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int one = sc.nextInt();
		System.out.println("Enter the 2st Number");
		int second = sc.nextInt();
		System.out.println("Enter the 3st Number");
		int third = sc.nextInt();
		if(one > second && one > third) {
			System.out.println("This is the Largest"+one);
		}
		else if(second > one && second > third) {
			System.out.println("this is the largest"+second);
		}
		else {
			System.out.println("This is the largest" +third);
		}
	}

}
