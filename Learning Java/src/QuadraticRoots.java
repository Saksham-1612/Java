public class QuadraticRoots {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please enter three arguments.");
            return;
        }

        double a = 0.0, b = 0.0, c = 0.0;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument format. Please enter three numbers.");
            return;
        }

        System.out.println("The values of a, b, and c are: " + a + ", " + b + ", " + c);
        double root1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double root2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println(root1+" "+root2);
    }
}
