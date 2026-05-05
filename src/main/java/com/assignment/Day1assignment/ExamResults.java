package com.assignment.Day1assignment;

import java.util.Scanner;

public class ExamResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		System.out.println("Enter your Attendance : ");
		int att = sc.nextInt();
		if(marks >=50 && att >=75) {
			System.err.println("Congratulations!!! you have passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
