package com.dhingra;
/* This is the program that will print a rocket
  We are going to print something
  06/03/2020
  This is my other line*/

import javax.swing.*;

public class Rocket1Challenge {

    public static void main(String[] args) { //mainmethod
        // This shows how to print something in a line
        Top();
        Box1();
        Box2();
        System.out.println("|United|");
        System.out.println("|States|");
        Box1();
        Box2();
        Box2();
        Box2();
        Top();

    }
    public static void Top() //this method prints the top part of the rocket
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void Box1()
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    public static void Box2()
    {
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

}
