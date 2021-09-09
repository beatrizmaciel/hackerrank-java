package com.possible.dateAndTime;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        InputStream fis = new FileInputStream("input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);
        bufferedReader.close();
    }
}

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.MONTH, month - 1);
        calendario.set(Calendar.DAY_OF_MONTH, day);
        calendario.set(Calendar.YEAR, year);
        return calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}