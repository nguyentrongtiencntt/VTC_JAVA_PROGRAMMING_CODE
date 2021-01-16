package com.company;


import java.util.Scanner;

public class Example extends sf1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 9;
        int c = 2;
        int delta = b*b-4*a*c;
        if(delta>0){
            pt2npb(a, b, delta);
        } else if(delta==0){
            ptcnk(a,b);
        } else {
            ptvn();
        }

    }

    private static void ptvn() {
        System.out.println("PTVN");
    }

    private static void ptcnk(int a, int b ) {
        double x1;
        x1 = -b/(2*a);
        System.out.println("x1=x2: " + x1);
    }

    static void pt2npb(int an, int bi, int delta){

        double x1 = (-bi + Math.sqrt(delta))/(2*an);
        double x2 = (-bi - Math.sqrt(delta))/(2*an);
        System.out.println(x1);
        System.out.println(x2);

    }



}
