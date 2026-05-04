package com.assignment.Day1assignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Temperature : ");
		int temp = sc.nextInt();
		if(temp > 35) {
			System.out.println("Vert Hot");
		}
		else if(temp>=25 && temp<=35) {
			System.out.println("Warm");
		}
		else if(temp >15 && temp<24) {
			System.out.println("Cool");
		}
		else if(temp<15) {
			System.out.println("Cold");
		}
		else {
			System.out.println("Enter valid temperature");
		}

	}

}
