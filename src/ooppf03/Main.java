package ooppf03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maPoint = Integer.parseInt(sc.nextLine());
        int litPoint = Integer.parseInt(sc.nextLine());

       Teacher tc1 =
               new Teacher(maPoint, litPoint);
        System.out.println(tc1);
        Teacher tc2 =
                new Teacher(9, 10);
        System.out.println(tc2);




    }
}
