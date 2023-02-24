import java.sql.SQLOutput;

public class StringCompareEmp {
    public static void main(String[] args) {
        String str="Hello World";
        String anotherSring="hello world";
        Object objStr=str;
        System.out.println(str.compareTo(anotherSring));
        System.out.println(str.compareToIgnoreCase(anotherSring));
        System.out.println(str.compareTo(objStr.toString()));
    }
}
