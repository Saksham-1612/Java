public class CA {
    public static void main(String[] args) {
        int [] mylist ={55,62,35,44};
        int [] y=mylist;
        mylist = new int[2];
        for (int i =0;i<mylist.length;i++)
        {
            System.out.println(y[i]+" ");
        }
    }
}
