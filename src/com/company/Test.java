package com.company;

public class Test {
    public static void main(String[] args) {
        int n = 10;
        int countchan = 0;
        int countle = 0;
        for (int i = 0; i <= n ; i++)
            if (check(i)){
                countchan ++;
            } else countle++;

        System.out.println("odd: " + countle);
        System.out.println("even: " + countchan);
    }
    private static boolean check(int nkt){
        boolean kt = false;
        if(nkt%2==0) kt =true;
        return kt;
    }
}
