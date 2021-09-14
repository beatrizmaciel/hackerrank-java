package com.possible.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String[]> hashset = new HashSet<>();
        hashset.add(pair_left);
        hashset.add(pair_right);


        if (pair_left != pair_right){
            for (int i = 1; i < t; i++){
                System.out.println(i);
            }
        }

    }
}
