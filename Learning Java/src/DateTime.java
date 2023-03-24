import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void ZonedTimeAndDate()
    {
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String currentDate=date.format(format1);

        System.out.println("Format 1 : "+currentDate);


        DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/yy HH/mm/ss");
        String currentDate1=date.format(format1);

        System.out.println("Format 2 : "+currentDate1);


        DateTimeFormatter format3=DateTimeFormatter.ofPattern("dd MM yy HH mm ss");
        String currentDate2=date.format(format3);

        System.out.println("Format 3 : "+currentDate2);


        DateTimeFormatter format4=DateTimeFormatter.ofPattern("dd,MM,yy HH,mm,ss");
        String currentDate3=date.format(format4);

        System.out.println("Format 4 : "+currentDate3);

        DateTimeFormatter format5=DateTimeFormatter.ofPattern("dd.MM.yy HH.mm.ss");
        String currentDate4=date.format(format5);

        System.out.println("Format 5 : "+currentDate4);


    }

    public static void main(String[] args) {
        DateTime object=new DateTime();
        object.ZonedTimeAndDate();
    }
}
