import java.io.UnsupportedEncodingException;

public class StringMethodsExample {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // Creating a string
        String str = "Hello, World!";

        // 1. length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt(int index)
        char ch = str.charAt(0);
        System.out.println("First character of the string: " + ch);

        // 3. codePointAt(int index)
        int codePoint = str.codePointAt(0);
        System.out.println("Unicode code point of the first character: " + codePoint);

        // 4. codePointBefore(int index)
        int codePointBefore = str.codePointBefore(1);
        System.out.println("Unicode code point before the second character: " + codePointBefore);

        // 5. codePointCount(int beginIndex, int endIndex)
        int codePointCount = str.codePointCount(0, 6);
        System.out.println("Number of Unicode code points in the first 6 characters: " + codePointCount);

        // 6. compareTo(String anotherString)
        int compareResult = str.compareTo("Hello, Java!");
        System.out.println("Comparison result between the original string and 'Hello, Java!': " + compareResult);

        // 7. compareToIgnoreCase(String str)
        int compareIgnoreCaseResult = str.compareToIgnoreCase("hello, world!");
        System.out.println("Comparison result ignoring case between the original string and 'hello, world!': " + compareIgnoreCaseResult);

        // 8. concat(String str)
        String concatStr = str.concat(" Goodbye!");
        System.out.println("Concatenated string: " + concatStr);

        // 9. contains(CharSequence s)
        boolean containsResult = str.contains("World");
        System.out.println("Whether the original string contains 'World': " + containsResult);

        // 10. contentEquals(CharSequence cs)
        boolean contentEqualsResult = str.contentEquals(new StringBuffer("Hello, World!"));
        System.out.println("Whether the original string content equals 'Hello, World!': " + contentEqualsResult);

        // 11. endsWith(String suffix)
        boolean endsWithResult = str.endsWith("!");
        System.out.println("Whether the original string ends with '!': " + endsWithResult);

        // 12. equals(Object anObject)
        boolean equalsResult = str.equals("Hello, World!");
        System.out.println("Whether the original string equals 'Hello, World!': " + equalsResult);

        // 13. equalsIgnoreCase(String anotherString)
        boolean equalsIgnoreCaseResult = str.equalsIgnoreCase("hello, world!");
        System.out.println("Whether the original string equals ignoring case 'hello, world!': " + equalsIgnoreCaseResult);

        // 14. format(String format, Object... args)
        String formattedStr = String.format("Hello, %s!", "Java");
        System.out.println("Formatted string: " + formattedStr);

        // 15. getBytes()
        byte[] bytes = str.getBytes();
        System.out.println("Byte array of the original string: " + bytes);

        // 16. getBytes(String charsetName)
        byte[] bytesWithCharset = str.getBytes("UTF-8");
        System.out.println("Byte array of the original string with UTF-8 charset: " + bytesWithCharset);

        // 17. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
    }
}
