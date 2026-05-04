package com.assignment.Day1assignment;

import java.util.Scanner;
import java.util.Arrays;
class Ecommerce {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number");
   int n = sc.nextInt();
   double arr[]  = new double[n];
   for(int i=0;i<arr.length;i++){
       arr[i] = sc.nextDouble();
   }
     System.out.println(Arrays.toString(arr));
     for(int i=0;i<n;i++){
         arr[i]=arr[i]-(arr[i]*0.10);
     }
     System.out.println(Arrays.toString(arr));
}
}