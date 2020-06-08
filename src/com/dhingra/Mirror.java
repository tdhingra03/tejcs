package com.dhingra;
/* This is the program that will print a rocket
  We are going to print something
  06/03/2020
  This is my other line*/

public class Mirror {

    public static void main(String[] args) { //mainmethod
        // This shows how to print something in a line
        line();
        Tophalf();
        Bottomhalf();
        line();

    }

    public static void line() //this method prints the lines on the top and bottom of the mirror
    {
        System.out.println("#================#");
    }

    public static void Tophalf() //this method prints the top half of the mirror
    {
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Bottomhalf() //this method prints bottom half of the mirror
    {
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }

}
