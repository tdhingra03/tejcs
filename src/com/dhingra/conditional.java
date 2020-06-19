package com.dhingra.;
import java.util.Random;
import java.util.Scanner;


public class conditional {
    public static void main(String[] args) {
        Random random=new Random();
        int integer;
        char playagain;



        do {
            integer= random.nextInt(137);
            System.out.println("Your number was " + integer);
            WeirdnotWeird(integer);
            Scanner userinput = new Scanner(System.in);
            System.out.println("do you want to play again? input Y or N");
            playagain= userinput.next().charAt(0);


        } while (playagain=='Y');
    }
    public static void WeirdnotWeird(int integer){
        if (integer % 2 == 1) {
            System.out.println("Weird");
        } else if (integer % 2 == 0 && integer >= 2 && integer <= 5) {
            System.out.println("Not Weird");
        } else if (integer % 2 == 0 && integer >= 6 && integer <= 20) {
            System.out.println("Weird");
        } else if (integer % 2 == 0 && integer >= 20) {
            System.out.println("Not Weird");
        }

    }
}