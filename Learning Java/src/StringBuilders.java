public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("I hate me !! ");
        StringBuffer sf=new StringBuffer("I was born genius");
        sf.append("You made me dumb");
        sf.insert(4,"But still");
        sf.substring(5);
        sf.charAt(5);
        sb.insert(2,"Don't know");
        sb.append("Hii saksham");
        sb.delete(5,8);
        sb.replace(1,5,"K");
        sb.indexOf("s");
        sb.lastIndexOf("s");
        sb.capacity();
        sb.equals("saks");
        sb.deleteCharAt(2);

        System.out.println(sb);
    }
}
