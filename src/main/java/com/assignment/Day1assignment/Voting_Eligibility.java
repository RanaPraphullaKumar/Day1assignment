package com.assignment.Day1assignment;

import java.util.Scanner;

public class Voting_Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		int age = sc.nextInt();
		if(age >= 100) {
			System.out.println("Invalid Age");
		}
		else if(age >= 18) {
			System.out.println("You Are Eligible For Voting");
		}
		else {
			System.out.println("Not Eligible For Voting");
		}

	}

}
