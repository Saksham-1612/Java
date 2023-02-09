import java.util.Scanner;

public class Methods {
    public static void fillArray(int array [],int  size)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< array.length;i++)
        {
            System.out.print("Numbers is : ");
            array[i]=sc.nextInt();
        }
    }    private static void printArray(int array [],int  size)
    {
        System.out.print("Numbers are : ");
        for (int j : array) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) {

        int SIZE=4;
//        create an array
        int[] array=new int [SIZE];
//        pass the array to the fillArray method
        fillArray(array,SIZE);
        System.out.println("Numbers are : ");
//        pass the array size
        printArray(array,SIZE);

    }
}
