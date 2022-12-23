public class InstanceOf {
    public static void main(String[] args) {
        String  name="Hello";
        boolean result1=name instanceof String;
        System.out.println("Name is an instance of String : "+result1);
        InstanceOf obj=new InstanceOf();
        boolean result2=obj instanceof InstanceOf;
        System.out.println(result2);
    }
}
