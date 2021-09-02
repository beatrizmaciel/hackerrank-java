package com.possible;

import java.util.Scanner;

public class StringCompare {

    public static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int i = 0;

        while (i+k <= s.length()) {
            if(s.substring(i,i+k).compareTo(smallest) < 0 ) {
                smallest = s.substring(i,i+k);
            } else if (s.substring(i,i+k).compareTo(largest) > 0) {
                largest = s.substring(i,i+k);
            }
            i++;
        }

//        for (int i = 1; i <= (s.length() - k); i++){
//            sequence = s.substring(i, (i + k));
//        }
//
//        if(s.compareTo(String.valueOf(k)) > 0){
//            System.out.println(s.substring(10,13));
//            System.out.println(s.substring(0,3));
//        }

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
