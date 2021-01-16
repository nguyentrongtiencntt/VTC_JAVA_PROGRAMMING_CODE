package com.company;

public class PrimerCheck {
    public static void main(String[] args) {

        int n = 17;
        if(check(n)==true)
            System.out.println("Primer");
        else System.out.println("Not primer");
    }

    private static boolean check(int m) {
        boolean ck = false;
        int count = 0;
        for (int i = 2; i < m ; i++) {
            if(m%i==0){
                count++;
            }
        }
        if(count == 0) ck = true;

        return ck;
    }
}
