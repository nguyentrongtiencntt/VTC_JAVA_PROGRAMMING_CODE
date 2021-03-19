package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class MainMark {
    public static void main(String[] args) {

        SUBJECT Math
                = new SUBJECT("Math");


        SUBJECT Physical
                = new SUBJECT("Physical", 7 , 8);
        SUBJECT Chemical
                = new SUBJECT("Physical", 7 , 8);
        ArrayList<SUBJECT> arrSubject
                = new ArrayList<>();
        arrSubject.add(Math);
        arrSubject.add(Physical);
        arrSubject.add(Chemical);

        for (SUBJECT i :arrSubject) {
            System.out.println(i);

        }




    }
}
