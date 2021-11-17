package com.company;
import java.util.Scanner;

class CollatzSequence{

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number=sc.nextInt();

        System.out.println("Sequence till number reduced down to one: ");
        int countSteps=0;
        while(number!=1){
            System.out.print(number+" ");
            if((number&1)==1){
                number=3*number+1;
            }
            else number=number/2;
            countSteps++;
        }

        System.out.println(number);
        System.out.println("Number of operations performed: "+ countSteps);

    }

}