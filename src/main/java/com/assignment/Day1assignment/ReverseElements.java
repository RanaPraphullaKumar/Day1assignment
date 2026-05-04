package com.assignment.Day1assignment;

import java.util.Scanner;
import java.util.Arrays;
class ReverseElements {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number");
   int n = sc.nextInt();
   System.out.println("Enter the Elements");
   int arr[]  = new int[n];
   for(int i = arr.length - 1; i >= 0; i--){
       arr[i] = sc.nextInt();
   }
     System.out.println(Arrays.toString(arr));
     
    
}
}