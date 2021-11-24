package student.management;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        StudentRecord s1=new StudentRecord();
        while(true){
        System.out.println("press 1: to add student into database: \n 2: to update student \n 3: to remove student: \n 4: to print a particular student detail \n 5: to print all student details: \n 6: to exit ");

        int option;
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        if(option==6) break;

        String registrationNumber;
        String name;
        String phoneNumber;
        String major;

            switch (option) {
                case 1 -> {
                    System.out.println("Enter the student details: ");
                    System.out.print("Enter the registration Number: ");
                    registrationNumber = sc.next();
                    System.out.print("Enter the name: ");
                    name = sc.next();
                    System.out.print("Enter phone Number: ");
                    phoneNumber = sc.next();
                    System.out.print("Enter the major: ");
                    major = sc.next();
                    s1.addStudent(registrationNumber, new Student(name, phoneNumber, major));
                }
                case 2 -> {
                    System.out.print("Enter the registration number to update: ");
                    registrationNumber = sc.next();
                    System.out.println("Enter the new details of student: ");
                    System.out.print("name: ");
                    name = sc.next();
                    System.out.print("phoneNumber: ");
                    phoneNumber = sc.next();
                    System.out.print("major: ");
                    major = sc.next();
                    s1.updateStudentDetailByRegistrationNumber(registrationNumber, new Student(name, phoneNumber, major));
                }
                case 3 -> {
                    System.out.print("Enter registration Number to remove student: ");
                    registrationNumber = sc.next();
                    s1.removeStudentByRegistrationNumber(registrationNumber);
                }
                case 4 -> {
                    System.out.print("Enter the registration Number of student to get details: ");
                    registrationNumber = sc.next();
                    s1.printDetailOfAParticularStudent(registrationNumber);
                }
                case 5 -> s1.printAllStudentDetail();
            }
    }

    }
}
