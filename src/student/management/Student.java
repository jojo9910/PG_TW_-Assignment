package student.management;

public class Student {
    private String name;
    private String phoneNumber;
    private String major;

    public Student(String name, String phoneNumber, String major) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.major=major;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
