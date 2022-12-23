public class LocalVariable
{
    public void age()
    {
        int age =0;
        age=age+7;
        System.out.println("Age is : "+age);
    }
    public static void main(String[] args) {
        LocalVariable L1=new LocalVariable();
        L1.age();
    }
}
