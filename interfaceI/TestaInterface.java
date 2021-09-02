package com.possible;

import java.util.Scanner;

public class TestaInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if (n % i == 0) {
            System.out.println(sum+=1);
            }
//            return sum;
        }
    }
}
