package com.possible.outputFormatting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
//            if(s1.length() > 10 && x > 0 && x < 999){
                System.out.printf("%-15s%03d%n", s1, x);
//            }
        }
        System.out.println("================================");


    }
}