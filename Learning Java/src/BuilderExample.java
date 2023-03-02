public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Java is good language not my favorite");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("java java java java ree");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
