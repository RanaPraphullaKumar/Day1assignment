package com.assignment.Day1assignment;

import java.util.Scanner;
import java.util.Arrays;

class Studenmarks {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Number of elements:");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int highest = arr[0];
    for (int i = 0; i < n; i++) {
        if (arr[i] > highest) {
            highest = arr[i];
        }
    }
    System.out.println("Largest element is: " + highest);

    double sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    double average = sum / n;
    System.out.println("The Average is: " + average);

    int count = 0;
    boolean found = false;

    for (int i = 0; i < n; i++) {
        if (arr[i] < average) {
            count++;
            found = true;
        }
    }

    if (found) {
        System.out.println("Number of students below average: " + count);
    } else {
        System.out.println("No students are below average.");
    }
}
}
