package com.basicsofjava.LowerTringularMatrix;

import java.util.Scanner;

public class LowerTriangularMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows in matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of columns in matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        boolean aUpperTriangleMatrix = true;

        System.out.print("Enter the elements of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                if (j >= i && matrix[i][j] == 0) aUpperTriangleMatrix = false;
                if (j < i && matrix[i][j] != 0) aUpperTriangleMatrix = false;
            }
        }
        if (aUpperTriangleMatrix) {
            System.out.println("Yes, it's a upper triangular matrix!");
        } else {
            System.out.println("No, it's a upper triangular matrix!");
        }
    }
}