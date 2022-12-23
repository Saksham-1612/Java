public class Retrun {
    public int add()
    {
        int x=10;
        int y=20;
        int z;
        z = x+y;
        return z;
    }
    public static void main(String[] args) {
        Retrun test =new Retrun();
        int add= test.add();
        System.out.println("The addition of a and b is : " + add);
    }
}
