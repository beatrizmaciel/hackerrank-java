package com.possible.java2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        System.out.println(maxHourglass(arr));
        bufferedReader.close();
    }

    /**
     * Métodos da classe Solution
     */

    public static int maxHourglass(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    private static int findSum(List<List<Integer>> arr, int r, int c) {
        int sum = arr.get(r + 0).get(c + 0) + arr.get(r + 0).get(c + 1) + arr.get(r + 0).get(c + 2)
                                   + arr.get(r + 1).get(c + 1) +
                arr.get(r + 2).get(c + 0) + arr.get(r + 2).get(c + 1) + arr.get(r + 2).get(c + 2);
        return sum;
    }
}
