package com.assignment.Day1assignment;

import java.util.Scanner;

public class Shopingdiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount that u have purchased :");
		int amt = sc.nextInt();
		double disc = 0;
		if(amt >=5000) {
			disc = amt * 0.30;
		}
		else if(amt >=3000) {
			disc = amt * 0.20;
		}
		else if(amt >=1000) {
			disc = amt * 0.10;
		}
		else {
			System.out.println("There is no Discount");
		}
		double finalamt = amt -disc;
		System.out.println("Your Final Discount is " +finalamt);

	}

}
