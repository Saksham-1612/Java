public class ForEach {
    public static void main(String[] args) {
        System.out.println("Command Line Arguments are : ");

        for (String str :args)
        {
            System.out.println( "Args : "+str);
        }
    }
}
