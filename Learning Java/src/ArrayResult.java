import java.util.Scanner;

public class ArrayResult {
    public static void main(String[] args) {
        int noOfStudent=5;
        System.out.println("Enter the number of student ");
        Scanner sc =new Scanner(System.in);
//        noOfStudent=sc.nextInt();
        int[] marks =new int[noOfStudent];
        for (int i=0;i<noOfStudent;i++)
        {
            marks[i]=sc.nextInt();
        }
        for (int x:marks) {
            System.out.print(x+" ");
        }
    }
}
