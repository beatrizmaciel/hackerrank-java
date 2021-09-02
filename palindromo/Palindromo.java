package com.possible;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String A = sc.nextLine();
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
