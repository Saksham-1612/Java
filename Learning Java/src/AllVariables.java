public class AllVariables {
    static int year=2023;
    public void myAge()
    {
        int age=18;
        System.out.println("Age is : "+age);
    }
    public static void main(String[] args) {
        String name="Saksham";
        AllVariables object=new AllVariables();
        System.out.println(AllVariables.year);
        System.out.println(name);
        object.myAge();
    }
}
