package com.company;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class sf6 {
    static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }

    static public void main(String[] args) {

        int so = Integer.MAX_VALUE;
        System.out.println(so);

        customFormat("###,###,### VND",so);
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.784);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);

    }
}
