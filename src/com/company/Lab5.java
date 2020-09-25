package com.company;

public class Lab5 {


    public static void main(String[] args) {
//        Define and write the values of an
//        array indices, so that the values
//        of the arrays should start from 1
//        and count to 100;


        LogicalOperations op = new LogicalOperations();

//        int[] myArray = op.getArrayToNumber(68);
//        op.printArray(myArray);


//Write a Java program to calculate the average
// value of array elements.

//        int[] secondArray = {5, 4, 1, 8, 6, 3, 7, 3};


//        System.out.println(op.getAverageFromArray(secondArray));

        String[] myStrings = {"Cosmin","Ioan","Ionela"};

//        System.out.println(op.isValueInArray(myStrings, "ionela"));

        if (op.isValueInArray(myStrings, "Cosmin")){
            System.out.println("A gasit valoarea ");
        }else {
            System.out.println("Nu a gasit valoarea ");

        }



    }
}
