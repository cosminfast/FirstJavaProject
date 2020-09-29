package com.company;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        ReadFromKeyboard read = new ReadFromKeyboard();

        int x = read.getInt();
        System.out.println("x este: " + x);

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(arr[scan.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index is not in array!");
        } catch (InputMismatchException e) {
            System.out.println("Not a valid number provided!");
        } finally {
            System.out.println("a ajuns aici");
        }
    }


}
