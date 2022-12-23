import java.sql.SQLOutput;

class Parent{}
class Child extends Parent{}
public class InstanceOperator {
    public static void main(String[] args) {
        Parent p =new Parent();
        Child c = new Child();
        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Parent);
        System.out.println(c instanceof Parent);
    }
}
