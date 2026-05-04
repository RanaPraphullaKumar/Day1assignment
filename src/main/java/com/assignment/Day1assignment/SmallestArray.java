package com.assignment.Day1assignment;

import java.util.Scanner;
import java.util.Arrays;
class SmallestArray {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number");
   int n = sc.nextInt();
   int arr[]  = new int[n];
   for(int i=0;i<n;i++){
       arr[i] = sc.nextInt();
   }
   System.out.println(Arrays.toString(arr));
   int min = arr[0];int pos = 0;
   for(int i = 0;i<n;i++){
       if(arr[i]<min){
           min = arr[i];
           pos = i;
       }
   }
   System.out.println("Smallest element is :" +min+ "position is : "+pos);
}
}