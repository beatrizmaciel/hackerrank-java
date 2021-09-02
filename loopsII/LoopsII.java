package com.possible;

import java.util.*;
import java.io.*;

public class LoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // ^ number of queries / número de linhas
        for(int i=0; i < t ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt(); // numero de colunas

            for (int z = 0; z < n; z++) {
                int resultado = 0;
//                resultado = resultado + (Math.pow(2, z) * b);
                System.out.print(resultado + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}
