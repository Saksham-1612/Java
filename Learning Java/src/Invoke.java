public class Invoke {
    public static void main(String[] args) {
        Invoke B = new Invoke();
        System.out.println("Invoking method " + B.getAValue());
        System.out.println("Invoking method " + B.getBvalue());
    }

    public int getAValue() {
        A a = new A();
        return a.getValue();
    }

    public int getBvalue() {
        B b = new B();
        return b.getBvalue();
    }
}

class A {
    public int avalue = 1;

    public int getValue() {
        return avalue;
    }
}

class B extends A {
    public int bvalue = 2;

    public int getBvalue() {
        return bvalue;
    }
}
