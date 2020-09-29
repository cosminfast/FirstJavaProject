package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt() {
        int number = 1231231231;
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid provided value.");
            }
        }
        return number;

    }
}
