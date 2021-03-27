package OOP.statickeyword;


import java.time.LocalDate;

class InTest extends Test{

     public static void main(String[] args) {

          LocalDate now = LocalDate.now();
          printDate(now);


     }
     static void printDate(LocalDate localDate){
          int Year = localDate.getYear();
          int Month = localDate.getMonth().getValue();
          int Day = localDate.getDayOfMonth();
          String st =
                  String.format("%d/%d/%d",Day,Month,Year);
          System.out.println(st);
     }


}
