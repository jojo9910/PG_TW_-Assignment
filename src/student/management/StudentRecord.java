package student.management;
import java.util.HashMap;
import java.util.Map;

public class StudentRecord {

    private Map<String, Student> studentsRecord = new HashMap<>();

    public StudentRecord(){
        new HashMap<String,Student>();
    }

    public void addStudent(String registrationNumber, Student student) {
        studentsRecord.put(registrationNumber, student);
    }

    public void updateStudentDetailByRegistrationNumber(String registrationNumber,Student updatedStudent){
        Student student= studentsRecord.get(registrationNumber);
        if(student!=null){
           studentsRecord.replace(registrationNumber,updatedStudent);
            System.out.println("Details updated successfully:");
        }
        else System.out.println("Student with this registration number not found:");
    }

    public void removeStudentByRegistrationNumber(String registrationNumber){
        if(studentsRecord.get(registrationNumber)!=null){
          studentsRecord.remove(registrationNumber);
            System.out.println("Student record deleted successfully: ");
        }
        else{
            System.out.println("Student not present in DataBase: ");
        }
    }

    public void printDetailOfAParticularStudent(String registrationNumber) {
        Student student=studentsRecord.get(registrationNumber);
        System.out.println("Student name: "+ student.getName()+" student phoneNumber: "+student.getPhoneNumber()+" student major: "+student.getMajor());
    }

    public void printAllStudentDetail() {
        for (Map.Entry<String, Student> entry : studentsRecord.entrySet()) {
            String key = entry.getKey();
            Student student=entry.getValue();
            System.out.println("Student Registration Number: "+key+" Student name: "+ student.getName()+" student phoneNumber: "+student.getPhoneNumber()+" student major: "+student.getMajor());
        }

    }
}
