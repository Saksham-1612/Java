import java.util.Scanner;

class M2{

    public static void fillArray(int array [],int  size)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< array.length;i++)
        {
            System.out.print("Numbers is : ");
            array[i]=sc.nextInt();
        }
    }
    public static void printArray(int[] array)
    {
        System.out.print("Numbers are : ");
        for (int j : array) {
            System.out.println(j);
        }
    }
}
public class Method2 {
    public static void main(String[] args) {

        int SIZE=4;
//        create an array
        int[] array=new int [SIZE];
//        pass the array to the fillArray method
        M2.fillArray(array,SIZE);
        System.out.println("Numbers are : ");
//        pass the array size
        M2.printArray(array);

    }
}