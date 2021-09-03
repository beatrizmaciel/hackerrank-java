package com.possible.dataTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main(String []argh) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
