package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String name = "N. T. Tien";
        char gender = 'M';
        int age = 25;

        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);

        System.out.println("Name: "+ name + "\tGender: "+gender+ "\tAge: "+age);
        //or use String.format()
        System.out.println(String.format("Name: %s \tGender: %c\tAge: ", name,gender,age));





    }
}
