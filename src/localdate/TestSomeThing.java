package localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestSomeThing {
    public static void main(String[] args) {

        minusPlus();
        someThing();
        getDayMonthYear();
        checkAfter();
        //checkBefore();
        compareTo();
        // ISO Date
        convertStringtoLocalDate();

    }

    private static void someThing() {
        LocalDate date =
                LocalDate.parse("2020-01-08");
        System.out.println(date);
        LocalDate dateFormat = LocalDate.parse("22-08-2020",
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(dateFormat.getMonth());
        System.out.println(dateFormat.getMonth().getValue());
        System.out.println(dateFormat.getDayOfMonth());
        System.out.println(dateFormat.getYear());
    }

    private static void checkAfter(){
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now().plusDays(1);
        LocalDate d3 = LocalDate.now().minusDays(1);
        System.out.println(d1.isAfter(d2)); // false
        System.out.println(d1.isAfter(d3)); // true
        System.out.println(d1.isAfter(d1)); // false
    }

    private static void checkBefore(LocalDate d1) {
        LocalDate d12 = LocalDate.now();
        LocalDate d22 = LocalDate.now().plusDays(1);
        LocalDate d32 = LocalDate.now().minusDays(1);
        System.out.println(d1.isBefore(d22)); // true
        System.out.println(d1.isBefore(d32)); // false
        System.out.println(d1.isBefore(d12)); // false
    }

    private static void compareTo() {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now();
        LocalDate d3 = LocalDate.now().minusDays(1);
        System.out.println(d1.compareTo(d2)); // 0
        System.out.println(d1.compareTo(d3)); // 1
        System.out.println(d3.compareTo(d2)); // -1
    }

    private static void convertStringtoLocalDate() {
        LocalDate localDate = LocalDate.parse("2020-05-03",
                DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate); // 2020-05-03
        // yyyy/MM/dd pattern
        LocalDate localDate1 = LocalDate.parse("2020/05/12",
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate1); // 2020-05-12
        // MMM dd, yyyy pattern
        LocalDate localDate2 = LocalDate.parse("May 05, 2020",
                DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        System.out.println(localDate2); // 2020-05-05
        // dd-MMM-yyyy pattern
        LocalDate localDate3 = LocalDate.parse("12-Jan-2020",
                DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println(localDate3); // 2020-01-12
        // dd-LL-yyyy pattern
        LocalDate localDate4 = LocalDate.parse("12-01-2020",
                DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println(localDate4); // 2020-01-12
    }
    private static void getDayMonthYear(){
        LocalDate localDate = LocalDate.now();
        System.out.println("Year : " + localDate.getYear()); // Year : 2020
        System.out.println("Month : " + localDate.getMonth().getValue()); // Month : 1
        System.out.println("Day of Month : " + localDate.getDayOfMonth()); // Day of Month : 4
        System.out.println("Day of Week : " + localDate.getDayOfWeek()); // Day of Week : SATURDAY
        System.out.println("Day of Year : " + localDate.getDayOfYear()); // Day of Year : 4
    }
    private static void minusPlus(){
        LocalDate localDate = LocalDate.now();
        // LocalDate's plus methods
        System.out.println("Addition of days : " + localDate.plusDays(5)); // Addition of days : 2020-01-09
        System.out.println("Addition of months : " + localDate.plusMonths(15)); // Addition of months : 2021-04-04
        System.out.println("Addition of weeks : " + localDate.plusWeeks(45)); // Addition of weeks : 2020-11-14
        System.out.println("Addition of years : " + localDate.plusYears(5)); // Addition of years : 2025-01-04
        // LocalDate's minus methods
        System.out.println("Subtraction of days : " + localDate.minusDays(5)); // Subtraction of days : 2019-12-30
        System.out.println("Subtraction of months : " + localDate.minusMonths(15)); // Subtraction of months : 2018-10-04
        System.out.println("Subtraction of weeks : " + localDate.minusWeeks(45)); // Subtraction of weeks : 2019-02-23
        System.out.println("Subtraction of years : " + localDate.minusYears(5)); // Subtraction of years : 2015-01-04
    }
}
