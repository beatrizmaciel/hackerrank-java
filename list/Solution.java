package com.possible.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int n = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < n; i++){
            lista.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        for (int j = 0; j < q; j++){
            String string = scanner.next();

            if (string.equals("Insert")){
                x = scanner.nextInt();
                y = scanner.nextInt();

                lista.add(x, y);
            } else {
                z = scanner.nextInt();

                lista.remove(z);
            }
        }

        scanner.close();

        for (int h = 0; h < lista.size(); h++){
            System.out.print(lista.get(h) + " ");
        }
    }
}
