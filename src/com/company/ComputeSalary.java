package com.company;
import java.util.Scanner;

public class ComputeSalary{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int [] weeklyWorkingHours=new int[7];
        int totalSalary=0, totalHours=0;
        System.out.println("Enter the weekly working hours: ");
        for(int i=0;i<7;i++){
            weeklyWorkingHours[i]=sc.nextInt();
            if(i==0 || i==6) continue;
            if(weeklyWorkingHours[i]>8){
                totalSalary+=(weeklyWorkingHours[i]-8)*15;
            }
            totalSalary+=weeklyWorkingHours[i]*100;
            totalHours+=weeklyWorkingHours[i];
        }
        if(totalHours>40){
            totalSalary+=(totalHours-40)*25;
        }
        totalSalary+=weeklyWorkingHours[0]*150;
        totalSalary+=weeklyWorkingHours[6]*125;
        System.out.println("Weekly computed Salary: "+totalSalary);

    }
}