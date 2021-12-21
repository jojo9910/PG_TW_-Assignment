package com.basicsofjava.TypeOfArray;

import java.util.Scanner;

public class TypeOfArray {

    public static String CheckTypeOfArray(int[] arr, int size) {
        int oddNum = 0, evenNum = 0;
        for (int i = 0; i < size; i++) {
            if ((arr[i] & 1) == 1) oddNum = 1;
            else evenNum = 1;
            if (evenNum == 1 && oddNum == 1) return "Mixed";
        }
        return (oddNum == 1) ? "Odd" : "Even";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Type of the given Array is: " + CheckTypeOfArray(arr, size));
    }
}