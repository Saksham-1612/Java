import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
     List <String> letters=new ArrayList<String>();
//        add example
        letters.add("A");
        letters.add("C");
        letters.add("D");

//        Lets insert B  in between A and C
        letters.add(1,"B");
        System.out.println(letters);
        List<String> list=new ArrayList<>();
        list.add("E");
        list.add("H");

//        Appending list elements
        letters.addAll(list);
//        clear
        list.add("F");
        list.add("G");
//        inset list in
        letters.addAll(5,list);
        System.out.println(letters);
//        contains
        System.out.println();
    }
}
