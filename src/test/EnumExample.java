package test;

public class EnumExample {
    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        WeekDay d = WeekDay.MONDAY;
        System.out.println(d);
    }
}
