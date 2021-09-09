package com.possible.bigInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        BigInteger firstBI = sc.nextBigInteger();
        BigInteger secondBI = sc.nextBigInteger();
        sc.close();

        System.out.println(firstBI.add(secondBI));
        System.out.println(firstBI.multiply(secondBI));
    }
}
