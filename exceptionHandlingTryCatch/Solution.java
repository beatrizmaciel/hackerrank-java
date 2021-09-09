package com.possible.exceptionHandlingTryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException arithmeticEx) {
            System.out.println(arithmeticEx);
        } catch (InputMismatchException inputMismatchEx) {
            System.out.println(inputMismatchEx.getClass().getName());
        }
    }
}
