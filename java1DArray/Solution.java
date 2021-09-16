package com.possible.java1DArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("input.txt"));
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }


        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
