package com.possible.primalityTest;

import java.io.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("input.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));

        String n = bufferedReader.readLine();

        BigInteger number = new BigInteger(n);
        //                         \/ retorna 1 se for true e -1 se for false
        if(number.isProbablePrime(1)){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
