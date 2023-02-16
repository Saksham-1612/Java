public class Cube {
    int length;
    int breadth;
    int height;

    Cube() {
        length = 10;
        breadth = 10;
        height = 10;
    }
    Cube(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    int getVolume()
    {
        int v =length*breadth*height;
        return v;
    }

    public static void main(String[] args) {
        Cube cube=new Cube();
        Cube cubeOne=new Cube(10,20,30);
        System.out.println("Cube is :"+cube.getVolume());
        System.out.println("Cube is :"+cubeOne.getVolume());

    }
}
