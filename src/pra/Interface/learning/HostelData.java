package pra.Interface.learning;

public interface HostelData {
     void hostelDetail();
    default void studentData()
    {
        System.out.println("Student selected on based : Percentage, Financial condition");
    }
    void student();
}
