import java.util.Scanner;

public class ExploringAllScannerMethods
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name : ");
        String name=sc.next();
        System.out.println("Enter you weight : ");
        int weight=sc.nextInt();
        System.out.println("Enter you balance : ");
        float balance=sc.nextFloat();
        System.out.println("Enter you gender : ");
        char gender=sc.next().charAt(0);
        System.out.println("Enter you Height : ");
        double height=sc.nextDouble();
        System.out.println("Enter you Mobile Number : ");
        long mobile =sc.nextLong();
        System.out.println("Are you above 19 ?");
        boolean adult= sc.nextBoolean();
        System.out.println("Favorite number below 255 ? ");
        byte favNum= sc.nextByte();
        System.out.println("Your room number ? ");
        short room=sc.nextShort();


        System.out.println("Your name : "+name);
        System.out.println("Your weight : "+weight);
        System.out.println("Your balance : "+balance);
        System.out.println("Your gender : "+gender);
        System.out.println("Enter you Height : "+height);
        System.out.println("Enter you Mobile Number : "+mobile);
        System.out.println("Are you above 19 ? "+adult);
        System.out.println("Favorite number below 255 ? "+favNum);
        System.out.println("Your room number ? "+room);
    }
}
