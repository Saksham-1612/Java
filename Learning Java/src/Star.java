public class Star {
    public static void main(String[] args) {
        int n=5;
        outer:
            for (int a=1;a<5;a++)
            {
                int j=0;
                int i=0;
                System.out.println();
                space:
                    while(true)
                    {
                        System.out.print(" ");
                        i++;
                        if (i== a)
                            break space;
                    }
                star:
                    while(true)
                    {
                        System.out.print(" * ");
                        j++;
                        if(j==n-a)
                        {
                            continue outer;
                        }
                    }
            }
    }
}
