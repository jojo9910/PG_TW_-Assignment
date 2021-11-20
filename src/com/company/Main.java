package com.company;
import java.util.Scanner;

public class Main{

    public static void main(String []args) {
        Holiday h1 = new Holiday("Independence Day", 15,"August");
        Holiday h2=new Holiday("Republic Day",26,"January");

        System.out.println(h1.GetHolidayName()+" "+h1.GetHolidayDay()+" "+h1.GetHolidayMonth());

        h1.SetHolidayName("Diwali");
        h1.SetHolidayDay(4);
        h1.SetHolidayMonth("November");

        System.out.println("check for same month holiday: "+h1.IsSameMonth(h2));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        Holiday [] array=new Holiday[size];
        for(int i=0;i<size;i++){
            String holidayName=sc.next();
            int holidayDay=sc.nextInt();
            String holidayMonth=sc.next();
            array[i]=new Holiday(holidayName,holidayDay,holidayMonth);
        }
        System.out.println("avg is: "+Holiday.avgDate(array));

    }
}