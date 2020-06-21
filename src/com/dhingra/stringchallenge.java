//Tej Dhingra Psuedocode
//Import java.util*
//make scanner object
//define variable # of string
//open do while loop
//use println to ask user how many string they want to input
//control #strings to be between 1 and 10 inclusive!
//use println to ask user to input string
//For loop to control T
//declare the String = call Method(new word)
//if statement
//for loop even letters
//for loop odd letters
//return method (be sure to include " ")!

package com.dhingra;
import java.util.*;

public class stringchallenge {
    public static void main(String[] args) {
        int stringnumber;
        Scanner userinput = new Scanner(System.in);
        do {
            System.out.println("How many strings would you like?");
            stringnumber = userinput.nextInt();
        }
        while (stringnumber < 1 || stringnumber > 10);

        for (int method = 1; method <= stringnumber; method++) {
            System.out.println("Input a string");
            String stringinput = userinput.next();
            if (stringinput.length() >= 2) {
                String words = output(stringinput);
                System.out.println(words);
            }
        }
    }
        public static String output(String stringinput){
            StringBuilder evenstring= new StringBuilder();
            StringBuilder oddstring= new StringBuilder();
            int stringlength= stringinput.length();
            for (int even=0; even<=stringlength-1;even=even+2){
                char outputchar= stringinput.charAt(even);
                evenstring.append(outputchar);
            }
            for (int odd=1; odd<=stringlength-1; odd=odd+2){
                char outputchar= stringinput.charAt(odd);
                oddstring.append(outputchar);
            }
            return evenstring + " " + oddstring;
        }
    }

