//         Tej Dhingra final project Pseudocode
//          Import java.io
//          Import java.util*
//          Create new file object w file path
//          Create Scanner ScanUser
//          Declare int variables score and times and initialize as 0
//          Declare boolean variable flag and define as false
//          Define string Next, NextInt, and NextDouble and initialize
//         Insert methods for welcome screen
//         Insert horizontal border method for welcome screen
//         Insert TopHalf method for welcome screen
//         Print “|     Welcome!     |”
//         Insert BottomHalf method for welcome screen
//         Insert horizontal border method for welcome screen
//         Call rules method
//         Create do while loop with while being flag == true
//         Define flag as true at the beginning
//         Create new Scanner called scanFile which scans the file
//         Ask the user if they want to guess words, integers, or doubles
//         Initialize string Category and define it as the user response
//         If Category contains or then ask the user to guess peoples names
//         Initialize string Answer and define it as the user response
//         While loop with while being as long as the file has a next
//         Define Next as scanFile.next
//         If Next contains the answer,
//         call right answer method with (score, times)
//         Score ++
//         Times++
//         Break
//         If Next does not contain answer,
//         Call wrong answer method with (score, times)
//         Times++
//         Define flag from return method equal to loop method with (scanUser, flag, score, times)
//         Else if Category contains nt then ask the user to guess an integer between 0 and 1000
//         Initialize AnswerInt and define it as the user response
//         While loop with while being as long as the file has a next
//         Define NextInt as scanFile.next
//         If NextInt equals the answerInt,
//         call right answer method with (score, times)
//         Score ++
//         Times++
//         Break
//         If NextInt does not equal answerInt,
//         Call wrong answer method with (score, times)
//         Times++
//         Define flag from return method equal to loop method with (scanUser, flag, score, times)
//         Else if Category contains ou then ask the user to guess a double between 0 and 1000
//         Initialize AnswerDouble and define it as the user response
//         While loop with while being as long as the file has a next
//         Define NextDouble as scanFile.next
//         If NextDouble equals the answerDouble,
//         call right answer method with (score, times)
//         Score ++
//         Times++
//         Break
//         If NextDouble does not equal answerDouble,
//         Call wrong answer method with (score, times)
//         Times++
//         Define flag from return method equal to loop method with (scanUser, flag, score, times)
//         Else
//               Define flag as false
//         Println not an option try again
//         Close do while loop
//         Close main
//         Create new void method RightAnswer with (int score, int times)
//         Score++
//         Times++
//         Print you are correct and give score and rounds won out of total rounds
//         Create new void method WrongAnswer with (int score, int times)
//         Times++
//         Print you are wrong and give score and rounds won out of total rounds
//         Create new boolean method called loop with (Scanner scanUser, boolean flag, int score, int times)
//         Ask user if they want to keep going
//         Define string YesNo as the answer
//         If YesNo contains an e
//         Define flag as true
//         Return flag
//         Else
//         Print thanks for playing and final score and final rounds won out of total rounds played
//         Define flag as false
//         Return flag
//         Create new void method for the horizontal border of the welcome
//         Print a #
//         Make a for loop for the equals
//         Println a #
//         Create a new void method for the TopHalf of the welcome
//         Create a for loop for the left most | column
//         Create a for loop for the spaces on the left side of the center
//         Print <>
//         Create a for loop for the dots
//         Print <>
//         Create a for loop for the spaces on the right side of the center
//         Create a for loop for the right most | column
//         Create a new void method for the BottomHalf of the welcome (basically make it inverse of TopHalf)
//         Create a for loop for the left most | column
//         Create a for loop for the spaces on the left side of the center
//         Print <>
//         Create a for loop for the dots
//         Print <>
//         Create a for loop for the spaces on the right side of the center
//         Create a for loop for the right most | column
//         Create a method for the rules
//         use however many println it takes to print the rules to the game for the user to read
       package com.dhingra;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;




public class wordgame {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner scanFile = new Scanner(file); is defined later in the loop where it works better
        Scanner scanUser = new Scanner(System.in);
        int score = 0; //initializing int score
        int times = 0; //initializing int times
        boolean flag; //creating boolean flag
        String Next = ""; //initializing Next for words
        String NextInt = ""; //initializing NextInt for ints
        String NextDouble = ""; //initializing NextDouble for doubles
        HorizontalBorder(); //this line and up till line 138 are the welcome picture methods
        TopHalf();
        HorizontalBorder();
        System.out.println("|    Welcome!    |");
        HorizontalBorder();
        BottomHalf();
        HorizontalBorder();
        Rules(); //calling the method that explains the rules


        do { // do while loop which controls how many times the user plays - as long as flag = true
            flag = true;
            File file = new File("/Users/tejdhingra/IdeaProjects/cssummer2020/src/com/dhingra/statenumber");
            Scanner scanFile = new Scanner(file);
            System.out.println("Do you want to guess words, integers, or doubles?");//initial choice between categories
            String Category = scanUser.next();
            if (Category.contains("or")) {//more flexible because they might put word, words, Words, Word
                System.out.println("Try to guess people's names that I'm thinking of!");
                String Answer = scanUser.next().toLowerCase(); //initializes + lowercases it so capitals doesn't matter
                while (scanFile.hasNext()) { //will perform as long as there is somethng next in the file

                    Next = scanFile.next();
                    if (Next.contains(Answer)) {//for if the scan contains the answer they guessed -->they're right
                        RightAnswer(score, times);
                        score++;
                        times++;
                        break;
                    }

                }
                if (!Next.contains(Answer)) { //for if the scan doesn't contain their  guess --> they're wrong

                    WrongAnswer(score, times);
                    times++;
                }

                flag = loop(scanUser, flag, score, times); //from the return method that asks if they want to keep going

            } else if (Category.contains("nt")) { //if it isn't the first category word then it'll come here to int game
                System.out.println("try to guess an integer from 9 - 1000!");
                String AnswerInt = scanUser.next();
                while (scanFile.hasNext()) { //this is pretty much the same process as the word game
                    if (scanFile.hasNext()) {
                        NextInt = scanFile.next();

                        if (NextInt.equals(AnswerInt)) {
                            RightAnswer(score, times);
                            score++;
                            times++;
                            break;
                        }
                    }

                }
                if (!(NextInt.equals(AnswerInt))) {

                    WrongAnswer(score, times);
                    times++;
                }

                flag = loop(scanUser, flag, score, times);

            } else if (Category.contains("ou")) { //comes here if the user didn't want word or int
                System.out.println("Hardest level: try to guess a double to the nearest tenth between 0 and 1000!");
                String AnswerDouble = ""; //same process as previous games pretty much, just with different variables
                while (scanFile.hasNext()) {
                    AnswerDouble = scanUser.next();
                    System.out.println("Double is " + AnswerDouble);
                    while (scanFile.hasNext()) {

                        NextDouble = scanFile.next();
                        if (NextDouble.equals(AnswerDouble)) {
                            RightAnswer(score, times);
                            score++;
                            times++;
                            break;
                        }
                    }
                    break;
                }
                if (!(NextDouble.equals(AnswerDouble))) {

                    WrongAnswer(score, times);
                    times++;
                }

                flag = loop(scanUser, flag, score, times);

            } else //this is where it comes if the user didn't pick a valid option and it sends the back
            {
                flag = true; //sends them back to the beginning
                System.out.println("That's not an option silly goose!");
            }

        }

        while (flag); //this is the conditions for the loop, it'll repeat while flag = true

    }

    public static void RightAnswer(int score, int times) { //method for if they get the right answer
        score++;//increases score in here
        times++;//increases times in here
        System.out.println("You are correct! Your score is now: " + score + " and you've won " + score + " out of "
                + times + " of your rounds. "); //message to let the user know they're right and their score and rounds
        System.out.println("You're one smart cookie!"); //cute message
    }

    public static void WrongAnswer(int score, int times) { //method for if they get the wrong answer
        times++;//increases times in here
        System.out.println("You are Wrong. Your score is: " + score + " and you've won " + score + " out of " + times +
                " of your rounds."); //message to let the user know they're wrong and their score and rounds played
        System.out.println("It's ok...the silly cookie and the smart cookie are equally delicious!");//cute message
    }

    public static boolean loop(Scanner scanUser, boolean flag, int score, int times) {//this is my return method
        System.out.println("Do you want to keep going?"); //this is for the loop
        String YesNo = scanUser.next();
        if (YesNo.contains("e")) {
            flag = true;
            return flag; //this is the value that gets returned, loop will continue
        } else {
            System.out.println("Thanks for playing! Your final score is: " + score + " and you've won " + score +
                    " out of " + times + " of your rounds."); //final score + rounds
            HorizontalBorder(); //goodbye screen
            TopHalf();
            HorizontalBorder();
            System.out.println("|    Goodbye!    |");
            HorizontalBorder();
            BottomHalf();
            HorizontalBorder();//goodbye screen
            flag = false;
            return flag; //this is the value that gets returned loop will end
            /*i know the return flag could have been done once outside the if else instead of twice inside of it, but I
            did once inside both if and else just for organization purposes*/
        }

    }

    //This is the Horizontal border for the image
    public static void HorizontalBorder() {
        System.out.print("#");
        for (int border = 1; border <= 16; border++) {
            System.out.print("*");
        }
        System.out.println("#");
    }

    //This is the for loops for the Bottom Half Method
    public static void BottomHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= 4 * line - 4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= -2 * line + 8; space++) {

                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    //This is the for loops for the Top half method
    public static void TopHalf() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int space = 1; space <= 2 * line - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + 16; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= 2 * line - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }


    }

    public static void Rules() //here is the void method for the rules
    {
        System.out.println("Rules:");
        System.out.println("Welcome to the guessing game!");
        System.out.println("You can try to guess words, integers, or doubles (decimals) to the nearest tenth.");
        System.out.println("After each completed guess, you'll get an option to quit.");
        System.out.print("Let's begin! ");
    }
}