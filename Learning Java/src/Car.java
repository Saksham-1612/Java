public class Car {
    String model;
    int chasisno;
    int engineCap;

//    Member Function
    void setter(String model,int chasisno,int engineCap)
    {
        this.chasisno=chasisno;
        this.model=model;
        this.engineCap=engineCap;
    }
    void getter()
    {
        System.out.println(model);
        System.out.println(engineCap);
        System.out.println(chasisno);
    }
    public static void main(String[] args) {
        Car Gwagon =new Car();
        Gwagon.setter("Mercedes Benz",5656,45678);
        Gwagon.getter();
    }
}
