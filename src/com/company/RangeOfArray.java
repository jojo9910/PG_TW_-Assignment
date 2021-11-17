package com.company;
import java.util.Scanner;

public class RangeOfArray{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size=sc.nextInt();
        System.out.print("Enter the Array elements: ");
        int maximumElement=Integer.MIN_VALUE,minimumElement=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            int num=sc.nextInt();
           minimumElement=Math.min(minimumElement,num);
           maximumElement=Math.max(maximumElement,num);
        }
        System.out.println("Difference between maximum and minimum Element of Array is: "+(maximumElement-minimumElement));

    }


}