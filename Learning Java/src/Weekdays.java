enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Weekdays {
    Day day;

    public Weekdays(Day day)
    {

        this.day=day;
    }

    public void dayIsLike()
    {
        switch (day) {
            case MONDAY -> System.out.println("Mondays are busy.");
            case TUESDAY -> System.out.println("Tuesdays are productive.");
            case WEDNESDAY -> System.out.println("Wednesdays are just average.");
            case THURSDAY -> System.out.println("Thursdays are almost the weekend.");
            case FRIDAY -> System.out.println("Fridays are the best day of the week.");
            case SATURDAY -> System.out.println("Saturdays are for relaxation.");
            case SUNDAY -> System.out.println("Sundays are for preparation.");
            default -> System.out.println("Invalid day.");
        }
    }

    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays(Day.FRIDAY);
        weekdays.dayIsLike();
    }
}
