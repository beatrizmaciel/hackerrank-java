package com.possible.stringsIntroduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        String A = scanner.next();
        String B = scanner.next();

        int sum = A.length() + B.length();
        System.out.println(sum);

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String A1 = (A.substring(0, 1)).toUpperCase() + A.substring(1);
        String B1 = (B.substring(0, 1)).toUpperCase() + B.substring(1);


        System.out.println(A1 + " " + B1);

    }

}
