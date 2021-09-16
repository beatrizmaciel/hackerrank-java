package com.possible.hashset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("input.txt"));
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> hashset = new HashSet<>();

        for (int i = 0; i < t; i++){
            hashset.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(hashset.size());
        }
    }
}
