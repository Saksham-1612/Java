import java.util.Scanner;

public class Ammusement
{
    public static void main(String[] args) {
        System.out.println("Price is 700 ");
        System.out.println("Discount for boys is 25%");
        System.out.println("Discount for girls is 50%");
        Scanner sc=new Scanner (System.in);
        int price=700;
        System.out.println("Enter the number of boy(s): ");
        int boys= sc.nextInt();
        System.out.println("Enter the number of girl(s): ");
        int girls=sc.nextInt();
        int boysDiscount=price - price/4;
        int girlsDiscount=price - price/2;
        int bill=(girlsDiscount*girls)+(boysDiscount*boys);
        System.out.println("Total Bill is : "+bill);
    }
}
