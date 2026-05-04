package com.assignment.Day1assignment;

import java.util.Scanner;

public class StudentGreadSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Marks :");
		int Marks = sc.nextInt();
		if(Marks <= 50) {
			System.out.println("Fail");
		}
		else if(Marks >= 50 && Marks <= 74){
			System.out.println("Your Grade is C");
		}
		else if(Marks >= 75 && Marks <= 89) {
			System.out.println("Your Grade is B");
		}
		else if(Marks >= 90 ) {
			System.out.println("Your Grade is A");
		}
		else {
			System.out.println("You have given wrong marks");
		}
				

	}

}
