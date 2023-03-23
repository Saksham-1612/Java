public class CopyCons{
    private int rollNumber;
    private int age;
    private String name;

//    default constructor
    public CopyCons(String name,int age,int rollNumber)
    {
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
    }
    // default copy constructor
    public CopyCons(CopyCons student)
    {
        this.rollNumber= student.rollNumber;
        this.name=student.name;
        this.age=age;
    }
}