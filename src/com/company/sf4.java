package com.company;

import java.util.Locale;

public class sf4 {
    public static void main(String[] args) {
        double floatVar = 5;
        int intVar = 10;
        String stringVar ="No thing to print!";
        System.out.format("The value of " +
                "the float variable is " +
                "%f, while the value of the "
                + "integer variable is %d, " +
                "and the string is %s", floatVar, intVar, stringVar);

        System.out.format(Locale.FRANCE,
                "The value of the float " + "variable is %f, while the " +
                        "value of the integer variable " + "is %d, and the string is %s%n",
                floatVar, intVar, stringVar);
    }
}
