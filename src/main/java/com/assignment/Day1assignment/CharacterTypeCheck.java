package com.assignment.Day1assignment;

import java.util.Scanner;

public class CharacterTypeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Character");
		char ch = sc.next().charAt(0);
		if((ch == 'a' && ch=='z')||(ch=='A' && ch=='Z')||(ch >= 48 && ch <= 57)||(!(ch >= 48 && ch <= 57) && 
			    !(ch >= 65 && ch <= 90) && 
			    !(ch >= 97 && ch <= 122))) {
			System.out.println(ch);
		}
	}

}
