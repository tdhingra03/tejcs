package com.dhingra;
/* This is the program that will print a mirro
    Version using For Loop
    06/04/2020
    This is my other line*/

public class Mirrorversion2{
    public static final int SIZE=4;
    public static void main(String[] args){
        line();
        Top();
        Bottom();
        line();
    }





    public static void line() //this method prints the lines on the top and bottom of the mirror
    {
        System.out.print("#");
        // initialize         control         increment the
        // a variable         the variable    variable by 1
        for (int dash=0;      dash<4*SIZE;        dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top() //this method prints the top half of the mirror
    {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            spacesdown(line);
            System.out.print("<>");
            for (int dot = 0; dot < 4 * line - SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesdown(line);
            System.out.println("|");


        }
}
public static void spacesdown (int line){
    for (int space = 0; space < line * -2 + 2*SIZE; space++) {
        System.out.print(" ");
    }
}

public static void Bottom () //this method prints the bottom half of the mirror
{
    for (int line = 1; line <= SIZE; line++) {
        System.out.print("|");
        spacesup(line);
        System.out.print("<>");
        for (int dot = 0; dot < -4 * line + 4*SIZE; dot++) {
            System.out.print(".");
        }
        System.out.print("<>");
        spacesup(line);
        System.out.println("|");


    }



}
public static void spacesup (int line){
    for (int space = 0; space < 2* line -SIZE/2; space++) {
        System.out.print(" ");
    }
}

}

 //   public static void Bottomhalf() //this method prints bottom half of the mirror

