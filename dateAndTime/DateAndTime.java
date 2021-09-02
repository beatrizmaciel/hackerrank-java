package com.possible;

import java.util.*;

public class DateAndTime {

    public static void main(String[] args) {
        int month = 5;
        int day = 15;
        int year = 2015;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);

//        System.out.println((Calendar.DAY_OF_WEEK), Calendar.LONG, Locale.US).toUpperCase());

    }
}