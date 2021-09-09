package com.possible.stringReverse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc=new Scanner(new File("input.txt"));
        String A=sc.next();
        String palindromo = "";

        for(int i = A.length() -1; i >= 0; i--){

            palindromo += A.charAt(i);

        }

        if(palindromo.equals(A)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");

        }
        sc.close();

    }
}
