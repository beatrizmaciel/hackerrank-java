package com.possible.arraylist;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        int n = scanner.nextInt();
        int d;

        ArrayList[] nArray = new ArrayList[n]; // n é a quantidade de arrays

            for (int i = 0; i < n; i++) {
                d = scanner.nextInt();
                nArray[i] = new ArrayList();
                for (int j = 0; j < d; j++){
                    nArray[i].add(scanner.nextInt());
            }
        }
            int q = scanner.nextInt();
            int x;
            int y;

            for (int h = 0; h < q; h++){
                x = scanner.nextInt();
                y = scanner.nextInt();
                try{
                    System.out.println(nArray[x-1].get(y-1));
                } catch(Exception e){
                    System.out.println("ERROR!");
                }
            }

        scanner.close();
    }
}
