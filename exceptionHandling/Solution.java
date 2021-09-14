package com.possible.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static Scanner in;

    static {
        try {
            in = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {

    public int power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        return (int) Math.pow(n, p);
    }
}
