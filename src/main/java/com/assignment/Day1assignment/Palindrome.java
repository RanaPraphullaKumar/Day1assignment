package com.assignment.Day1assignment;


import java.util.Arrays;
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int n = sc.nextInt();
       System.out.println("Enter the Elements");
       int arr[]  = new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int rev[] = new int[n];
       for(int i=0;i<n;i++){
           rev[i]=arr[n-1-i];
       }
       if(Arrays.equals(arr,rev)){
           System.out.println("Its a Palindrome");
       }
       else{
           System.out.println("Its not a Palindrome");
       }
    }
}


