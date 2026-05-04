package com.assignment.Day1assignment;

import java.util.Scanner;
import java.util.Arrays;

class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in 1st array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements for 1st array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in 2nd array:");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements for 2nd array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));
        System.out.println("Matching elements:");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    found = true;
                    break; 
                }
            }
        }
        if (!found) {
            System.out.println("No elements are matching");
        }
    }
}
