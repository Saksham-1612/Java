public class IntegerInput
{
    public static void main(String[] args) {
        for (String str:args)
        {
            int argument=Integer.parseInt(str);
            System.out.println("Arguments in interger form "+argument);

        }
    }
}
