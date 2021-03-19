package com.company;

public class Square {
    public static void main(String[] args) {

        int n = 37;
        System.out.println(check(n));

    }
    private static boolean check(int n){
        boolean ck = false;
        double cp = Math.sqrt                                                                                      (n);
        double cpsquare = cp*cp;
        int IntValue = (int) Math.round(cp);
        if(cp==IntValue){
            ck = true;
        }
        return ck;
    }
}
