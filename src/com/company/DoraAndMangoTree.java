package com.company;
import java.util.Scanner;

public class DoraAndMangoTree {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row= sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col= sc.nextInt();
        System.out.println("Enter the number of treeNumber to be Checked: ");
        int treeNumber= sc.nextInt();
        int range=row*col;
        if(row<=0 || col<=0 || treeNumber>range){
            System.out.println("Not a Valid input!");
        }
        else{
            if(treeNumber%col==0 || treeNumber%col==1 || treeNumber<col){
                System.out.println("Yes, That's a mango tree.");
            }else System.out.println("No, That's not a right choice.");
        }

    }
}
