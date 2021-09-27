package com.possible.substringComparisons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int i=0;

        while(i+k<=s.length()) {
            if(s.substring(i,i+k).compareTo(smallest) < 0 ) {
                smallest = s.substring(i,i+k);
            } else if (s.substring(i,i+k).compareTo(largest) > 0) {
                largest = s.substring(i,i+k);
            }
            i++;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}