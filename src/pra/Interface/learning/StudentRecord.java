package pra.Interface.learning;

// this program demonstrates how to achieve multiple inheritance in java
public class StudentRecord implements CollegeData,HostelData{

    @Override
    public void collegeDetail() {
        System.out.println("College Name : D");
        System.out.println("College Grade : A");
        System.out.println("University of College : KUK");
    }

    @Override
    public void studentData() {
        // we can't change the implementation of functions here
        System.out.println("@@");
        CollegeData.super.studentData();
        HostelData.super.studentData();
    }

    @Override
    public void student() {
        System.out.println("they are not there!!");
    }

    @Override
    public void hostelDetail() {
        System.out.println("Hostel Name : RAMA");
        System.out.println("Hostel location : KUK");
    }

    public static void main(String[] args) {
        StudentRecord s=new StudentRecord();
        s.collegeDetail();
        s.hostelDetail();
        s.student();
        s.studentData();
    }
}
