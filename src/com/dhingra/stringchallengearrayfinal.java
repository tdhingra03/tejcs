//Tej Dhingra Psuedocode
//Import java.util*
//make scanner object
//define variable # of string
//open do while loop
//declare array wordnumber
//use println to ask user to type word
//For loop to control
//declare the String = call Method(new word)
//if statement
//for loop even letters
//for loop odd letters
//return method (be sure to include " ")!

package com.dhingra;


import java.util.Scanner;

public class stringchallengearrayfinal {
    public static Scanner Keyboard= new Scanner(System.in);
    public static void main(String[] args){
        int wordnumber;
        do {
            System.out.println("How many word do you want to type?");
            wordnumber= Keyboard.nextInt();
        }while (wordnumber<1 || wordnumber>10);


        for (int method=1; method<=wordnumber; method++)
            String[] words = new String[wordnumber];
            System.out.println("type your word");

            String wordcount= Keyboard.next();




        if (wordcount.length()>=2){
            String words= output(wordcount);
            System.out.println(words);
        }


    }

    public static String output (String input){
        String even= "";
        String odd= "";
        int wordlength= input.length();
        for (int evenindex=0; evenindex<=wordlength-1; evenindex=evenindex+2){
            char evenoutput= input.charAt(evenindex);
            even=even+evenoutput;
        }
        for (int oddindex=0; oddindex<=wordlength-1; oddindex=oddindex+2){
            char oddoutput= input.charAt(oddindex);
            odd=odd+oddoutput;
        }
        return even + " " + odd;
    }
}



