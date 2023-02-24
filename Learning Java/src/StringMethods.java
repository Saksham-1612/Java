import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String strOb1 = "Ram";
        String strOb2 = "LPU";
        String bla="Hi,Friends";
        str a="saksham is a nice guy"
        String strOb3 = strOb1 + "and" + strOb2;
        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);
        System.out.println(strOb1.equals(strOb2));
        System.out.println(strOb1.length());
        System.out.println(strOb1.toUpperCase());
        System.out.println(strOb1.toLowerCase());
        System.out.println(strOb1.concat(strOb2));
        System.out.println(strOb1+strOb2);
        System.out.println(strOb1.compareTo(strOb2));
        System.out.println("Check blank or not ? : "+bla.isBlank());
        System.out.println(strOb1.getBytes());
        System.out.println(Arrays.toString(bla.split(",")));
        System.out.println(strOb1.indexOf('R'));
        System.out.println(strOb1.lastIndexOf('a'));
        System.out.println(strOb1.contains("s"));
        System.out.println(strOb1.endsWith(" "));
        System.out.println(strOb1.charAt(2));
        String formattedStr = String.format("Hello, %s!", "Java");
        System.out.println("Formatted string: " + formattedStr);
        byte[] bytes = strOb1.getBytes();
        System.out.println("Byte array of the original string: " + bytes);
        // 17. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] charArray = new char[5];
        str.getChars(0, 5, charArray, 0);
        System.out.println("First 5 characters of the original string in a char array: " + charArray);

        // 18. indexOf(int ch)
        int indexOfResult = str.indexOf('o');
        System.out.println("Index of the first occurrence of 'o' in the original string: " + indexOfResult);

        // 19. indexOf(int ch, int fromIndex)
        int indexOfFromIndexResult = str.indexOf('o', 5);
        System.out.println("Index of the first occurrence of 'o' after index 5 in the original string: " + indexOfFromIndexResult);

        // 20. indexOf(String str)
        int indexOfStrResult = str.indexOf("World");
        System.out.println("Index of the first occurrence of 'World' in the original string: " + indexOfStrResult);

        // 21. indexOf(String str, int fromIndex)
        int indexOfStrFromIndexResult = str.indexOf("World", 7);
        System.out.println("Index of the first occurrence of 'World' after index 7 in the original string: " + indexOfStrFromIndexResult);

        // 22. intern()
        String internedStr = str.intern();
        System.out.println("Interned string: " + internedStr);

        // 23. isEmpty()
        boolean isEmptyResult = str.isEmpty();
        System.out.println("Whether the original string is empty: " + isEmptyResult);

        // 24. join(CharSequence delimiter, CharSequence... elements)
        String joinedStr = String.join(", ", "apple", "banana", "orange");
        System.out.println("Joined string: " + joinedStr);

        // 25. lastIndexOf(int ch)
        int lastIndexOfResult = str.lastIndexOf('o');
        System.out.println("Index of the last occurrence of 'o' in the original string: " + lastIndexOfResult);

        // 26. lastIndexOf(int ch, int fromIndex)
        int lastIndexOfFromIndexResult = str.lastIndexOf('o', 5);
        System.out.println("Index of the last occurrence of 'o' before index 5 in the original string: " + lastIndexOfFromIndexResult);

        // 27. lastIndexOf(String str)
        int lastIndexOfStrResult = str.lastIndexOf("World");
        System.out.println("Index of the last occurrence of 'World' in the original string: " + lastIndexOfStrResult);

        // 28. lastIndexOf(String str, int fromIndex)
        int lastIndexOfStrFromIndexResult = str.lastIndexOf("World", 7);
        System.out.println("Index of the last occurrence of 'World' before index 7 in the original string: " + lastIndexOfStrFromIndexResult);

        // 29. matches(String regex)
        boolean matchesResult = str.matches(".*");
        System.out.println("Whether the original string matches the regex '.*': " + matchesResult);

        // 30. offsetByCodePoints(int index, int codePointOffset)
        int offsetByCodePointsResult = str.offsetByCodePoints(0, 3);
        System.out.println("Index of the character 3 Unicode code points away from the first character in the original string: " + offsetByCodePointsResult);

        // 31. regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        boolean regionMatchesResult;
    }
}