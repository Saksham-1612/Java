import java.util.ArrayList;
import java.util.List;
public class arrayListExample {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("C");
        letters.add("D");

        letters.add(1, "B");
        System.out.println(letters);


        List<String> list = new ArrayList<String>();
        list.add("E");
        list.add("H");
        letters.addAll(list);
        System.out.println(letters);
        list.clear();
        list.add("F");
        list.add("G");

        letters.addAll(5, list);
        System.out.println(letters);


        System.out.println("Letters list contain F");
        System.out.println("Letters list contain E? "+letters.contains("E"));
        System.out.println("Letters list contain F? "+letters.contains("Z"));


    }
}