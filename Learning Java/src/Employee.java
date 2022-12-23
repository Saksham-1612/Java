class StaticVariable {
//    class Emp
    public static double salary;
    public static String name="Harsh";

}
public class Employee{
    public static void main(String[] args) {
        StaticVariable.salary=10000;
        System.out.println("Name : "+StaticVariable.name+"\nSalary : "+StaticVariable.salary);
    }
}
