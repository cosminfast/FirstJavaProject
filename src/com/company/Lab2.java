package com.company;

public class Lab2 {

    static double memberVariable;

    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        System.out.println("The sum is: " + math.sum(3, 5));

        memberVariable = math.sum(7,8);
        System.out.println(memberVariable);

    }



}
