import java.util.Scanner;

public class InputUsingScanner {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name :  ");
        String name=input.nextLine();
        System.out.println("My name is : "+ name);
    }
}
