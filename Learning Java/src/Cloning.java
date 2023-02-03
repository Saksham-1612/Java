public class Cloning {
    public static void main(String[] args) {
        int a[]={1,2,8};
        int b[] =new int[a.length];
        b=a;
        b[0]++;
        System.out.println("Content of a [] ");
        for (int x: a) {
            System.out.println(x+" ");
        }
        System.out.println("\n Contents of b[] ");
        for (int x:b)
            System.out.println(x + " ");
    }
}
