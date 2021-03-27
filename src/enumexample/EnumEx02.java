package enumexample;

enum WeekDay { // Không được khai báo access modifier (sử dụng default)
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumEx02 {
    public static void main(String[] args) {
        WeekDay d = WeekDay.MONDAY;
        System.out.println(d);
    }
}
