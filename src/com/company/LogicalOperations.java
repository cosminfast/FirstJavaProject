package com.company;

public class LogicalOperations {

    //       Given two numbers,
//       see which one is the greatest and print it
    public int verifyGreaterNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    //   Given a text input, if it is “FastTrack”,
//   then print “Learning text comparison”. If not,
//   print “Got to try some more”

    public String verifyTextFastTrack(String textInput){
        if (textInput.equals("FastTrack")){
            return "Learning text comparison.";
        }else {
            return "Got to try some more";
        }
    }


    //Given a text input and a number input, if the text is
// equal to “FastTrack” AND the number is equal to or
// lower than 3, print the text and the number. If the
// text is not “FastTrack” AND the number is equal to or
// higher than 4, print the number and the text, in this order

    public String checkTextAndNumber(String input, int number){
        if (input.equals("FastTrack") && number <= 3) {
           return (input + number);
        } else if (!input.equals("FastTrack") && number >= 4){
            return (number + input);
        }
        return "";
    }
}
