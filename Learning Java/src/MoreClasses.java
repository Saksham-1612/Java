import java.sql.SQLOutput;

class Marks{
    int phyMarks;
    private int mathMarks;
    int englishMarks;

}
class MoreClasses {
    public static void main(String[] args) {
        Marks saksham=new Marks();
        saksham.phyMarks=99;
//        saksham.mathMarks;
        saksham.englishMarks=100;
        Marks Bikki=new Marks();
        Bikki.phyMarks=9;
//        Bikki.mathMarks;
        Bikki.englishMarks=00;
        System.out.println("Bikki -> Physics Marks  : "+ Bikki.phyMarks);
        System.out.println("Bikki -> English Marks  : "+ Bikki.englishMarks);
    }
}
