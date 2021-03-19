package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBikeCycle {
    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        byte n = 0;
        ArrayList<Integer> a = new ArrayList();

        do {
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("5. Exit");
            n = scanner.nextByte();
            switch (n){
                case 1:
                {
                    System.out.print("Please input: ");
                    a.add(scanner.nextInt());
                }
                    break;
                case 2:{
                    System.out.print("Print");
                    for (int i = 0; i < a.size() ; i++) {
                        System.out.print("Resutl" + a.get(i) + " " );
                    }
                    break;
                }
                default: loop =false;
            }
        } while (loop);


    }
}
