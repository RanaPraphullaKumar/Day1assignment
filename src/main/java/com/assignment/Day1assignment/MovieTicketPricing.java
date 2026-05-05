package com.assignment.Day1assignment;

import java.util.Scanner;

public class MovieTicketPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		if(age <=12) {
			System.out.println("Your Ticket Price is : 100");
		}
		else if(age>=12 && age<=60) {
			System.out.println("Your Ticket Price is : 200");
		}
		else if(age>=60) {
			System.out.println("Your Ticket Price is : 120");
		}
		else
		{
			System.out.println("No Ticket For You");
		}
	}

}
