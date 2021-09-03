package com.possible.loopsI;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner in = new Scanner(new File("input.txt"));
        int N = in.nextInt();

        for(int i = 1; i <= 10; i++) {

            System.out.println(N + " x " + i + " = " + N * i);

            bufferedReader.close();
        }
    }
}
