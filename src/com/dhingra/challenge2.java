package com.dhingra;
/* This is the program that will print challenge 2
    Version using For Loop
    06/07/2020
    This is my other line*/

public class challenge2 {
    public static final int SIZE=4;
    public static void main(String[] args){
        line();
        Top();
        Bottom();
        line();
        Bottom();
        Top();
        line();

    }





    public static void line() //this method prints the lines on the top and bottom of the mirror
    {
        System.out.print("+");
        for (int dash=0;      dash<9;        dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() //this method prints the triangle right side up
    {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            spacestop(line);
            forwardslashtop(line);
            System.out.print("*");
            backslashtop(line);
            spacestop(line);
            System.out.println("|");


        }

}
public static void forwardslashtop (int line){
    for (int slash = 0; slash < 1 * line - 1; slash++) {
        System.out.print("/");
    }
}
//this prints forward slashes in right side up triangle

public static void backslashtop (int line) {
    for (int slash = 0; slash < 1 * line - 1; slash++) {
        System.out.print("\\");
    }
}
//this prints back slashes in right side up triangle

public static void spacestop (int line){
    for (int space = 0; space < line * -1 + 5; space++) {
        System.out.print(" ");
    }
}




public static void Bottom () //this method prints the upside down triangle
{
    for (int line = 1; line <= SIZE; line++) {
        System.out.print("|");
        spacesbottom(line);
        backslashbottom(line);
        System.out.print("*");
        forwardslashbottom(line);
        System.out.print("<>");
        spacesbottom(line);
        System.out.println("|");


    }



}
public static void spacesbottom (int line){
    for (int space = 0; space < line*1; space++) {
        System.out.print(" ");
    }
}

}

public static void backslashbottom (int line){
    for (int slash = 0; slash < ((-1 * line) + 4); slash++){
        System.out.print("\\");
    }
}
//this prints back slashes in upside down triangle

public static void forwardslashbottom (int line){
    for (int slash=0; slash< -1*line+4; slash++){
        System.out.print("/");
    }
}
//this prints forward slashes in upside down triangle

