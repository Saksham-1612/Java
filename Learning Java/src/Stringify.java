public class Stringify {
    int age;
    String name;
    void get()
    {
        System.out.println("Age : "+this.age);
        System.out.println("Name : "+this.name);
    }

    @Override
    public String toString() {
        return "Stringify{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
