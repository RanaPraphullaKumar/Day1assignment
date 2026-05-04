package com.assignment.Day1assignment;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username : ");
		String username = sc.nextLine();
		System.out.println("Enter Your Password");
		String password = sc.nextLine();
		if(username == "admin" && password == "1234") {
			System.out.println("Your Ligin Successfull");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}

}
