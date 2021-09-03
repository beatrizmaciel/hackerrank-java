package com.possible.loopsII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        int t = in.nextInt();
        for(int i=0; i < t ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int z = 0; z < n; z++){
                a = a + (int) Math.pow(2, z) * b;
                System.out.print(a + " ");
            }

            System.out.println("");
        }
        in.close();
    }

}
