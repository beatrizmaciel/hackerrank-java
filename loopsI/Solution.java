package com.possible.loopsI;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream fis = new FileInputStream("input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i <= 10; i++) {

            System.out.println(N + " x " + i + " = " + N * i);

            bufferedReader.close();
        }
    }
}
