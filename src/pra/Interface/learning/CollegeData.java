package pra.Interface.learning;

public interface CollegeData {
    void collegeDetail();
    default void studentData()
    {
        System.out.println("courses of Student : MCA, MTECH, MBA, BCA");
    }
    void student();
}
