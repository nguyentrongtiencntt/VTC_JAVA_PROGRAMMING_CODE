package enumexample;

public class EnumEx {
    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        for (WeekDay d : WeekDay.values()) {
            System.out.println(d);
        }

    }
}
