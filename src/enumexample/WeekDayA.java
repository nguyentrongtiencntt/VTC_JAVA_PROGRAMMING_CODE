package enumexample;

public enum WeekDayA {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}
class EnumExample {
    public static void main(String[] args) {
        WeekDay d = WeekDay.MONDAY;
        System.out.println(d);
    }
}
