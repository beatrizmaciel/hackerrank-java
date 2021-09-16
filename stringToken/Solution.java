package com.possible.stringToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        String s = scan.nextLine();
        String[] textSplit = s.split("[ !,?._'@]+");
        String t;
        ArrayList<String> textt = new ArrayList();

        for(int i = 0; i < textSplit.length; i++) {
            if (!textSplit[i].isEmpty()) { // só entra se não tiver vazio
                t = textSplit[i];
                textt.add(t);
            }
        }

        System.out.println(textt.size());

        for (int x = 0; x < textt.size(); x++){
            System.out.println(textt.get(x));
        }
        scan.close();
    }
}