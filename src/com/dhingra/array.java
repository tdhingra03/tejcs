//Tej Dhingra
//import scanner
//import random
//initialize variable for number of temperatures inputted by the user
//start do while loop, number of temp between 2 and 100 inclusive
//use next.Int() to initialize variable
//make array that holds all temepratures
//create random
//sum=0
//start for loop that prints out rand temp x number of times
//print random temps
//sum=sum+random temp
//find average sum/number of temps
//make counter that counts #temperatures
//final println to say how many days temp was above weekly avg



package com.dhingra;
import java.util.Scanner;
import java.util.Random;

public class array {
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args){
        int numberdays;
        do {
            System.out.print("How many temperatures?");
            numberdays=input.nextInt();
        }
        while (numberdays<2 || numberdays>100);
        int [] temps= new int[numberdays];
        Random randy= new Random();
        int sum=0;
        for (int index=0; index<temps.length; index++){
            temps[index]=randy.nextInt(85)+25;
            System.out.println(temps[index]);
            sum=sum+temps[index];
        }
        System.out.println("The sum of the temperatures is: " + sum);
        double average= (double) sum/numberdays;
        System.out.println("The average of all the temperatures is: " + average);
        int counter=0;
        for (int index=0; index<temps.length; index++){
            if (temps[index]>average){
                counter=counter+1;
            }
        }
        System.out.println(counter+ " days were above average");

    }
}
