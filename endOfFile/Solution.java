package com.possible.endOfFile;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int i = 1;
        while(sc.hasNext()){
           System.out.println(i + " " + sc.nextLine());
           i++;
        }
        sc.close();
    }
}
