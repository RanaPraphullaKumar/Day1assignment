package com.assignment.Day1assignment;
import java.util.Scanner;
import java.util.Arrays;
class BinarySearch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int n = sc.nextInt();
       int arr[]  = new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }
         System.out.println(Arrays.toString(arr));
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         System.out.println("Enter number to be found");
         
         int key = sc.nextInt();
        int res =  Arrays.binarySearch(arr,key);
         if(res>=0){
             System.out.println("Element found" + key + "found at" +res);
         }
         else{
             System.out.println("Element not found");
         }
    }
}