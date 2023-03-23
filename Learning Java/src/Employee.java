public class Employee {
    String name;
    int age;
    String designation;

    void setData(int age,String name,String designation)
    {
        this.age=age;
        this.designation=designation;
        this.name=name;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Designation : "+designation);
    }

    public static void main(String[] args) {
        Employee Saksham=new Employee();
        Saksham.setData(20,"Saksham","SDE 1");
        Saksham.display();
    }

}
//compile time
//runtime
//single and multi
//abstract class
