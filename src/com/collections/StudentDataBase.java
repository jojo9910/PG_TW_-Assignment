package com.collections;

import java.util.HashSet;
import java.util.Scanner;

public class StudentDataBase {

    public static void main(String[] args) {

        HashSet<Student> StudentsData = new HashSet<Student>();
        while (true) {
            System.out.println("press 1: to add student into database: \n 2: to remove student \n 3: to update student: \n 4: to exit");
            int option;
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            if (option == 4) break;
            int registrationNumber;
            String name;
            String phoneNumber;
            Student student;

            switch (option) {
                case 1:
                    System.out.print("Enter the registration number of student:");
                    registrationNumber = sc.nextInt();
                    System.out.print("Enter the name of student: ");
                    name = sc.next();
                    System.out.print("Enter the phone number of student:");
                    phoneNumber = sc.next();
                    StudentsData.add(new Student(registrationNumber, name, phoneNumber));
                    System.out.println("Student has been added successfully");
                    break;
                case 2:
                    System.out.print("Enter the registration number, name,phoneNumber of student to remove:");
                    registrationNumber = sc.nextInt();
                    name = sc.next();
                    phoneNumber = sc.next();
                    student = new Student(registrationNumber, name, phoneNumber);
                    if (StudentsData.contains(student)) {
                        StudentsData.remove(student);
                        System.out.println("Student has been removed:");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Registration number of the student to update:");
                    registrationNumber = sc.nextInt();
                    for (Student obj : StudentsData) {
                        if (registrationNumber == obj.getRegistrationNumber()) {
                            System.out.println("Enter the new details: ");
                            registrationNumber = sc.nextInt();
                            name = sc.next();
                            phoneNumber = sc.next();
                            obj.setRegistrationNumber(registrationNumber);
                            obj.setName(name);
                            obj.setPhoneNumber(phoneNumber);
                            break;
                        }
                    }
                    System.out.println("Student data has been updated:");
                    break;
            }
        }
    }
}