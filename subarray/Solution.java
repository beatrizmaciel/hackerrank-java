package com.possible.subarray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int negativeSum = 0;
        for (int j = 0; j < array.length; j++) {
            for (int z = j; z < array.length; z++) {
                Boolean isNegativeSum = negativeSum(j,z, array);

                if (isNegativeSum) {
                    negativeSum++;
                }
            }
        }
        System.out.println(negativeSum);
    }

    public static Boolean negativeSum(int j, int z, int[] array) {

        int sum = 0;
        for (int i = j; i <= z; i++) {
            sum += array[i];
        }

        if (sum < 0)
            return true;

        return false;

    }
}