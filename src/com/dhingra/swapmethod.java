//Tej Dhingra Psuedocode:
//import java.util
//create a random object and define as array size, bounded from 5-10
//create an array called "numbers"
//create a for loop that defines i as 0 and repeat (as long as i is less than array size
//create new random variable, bounded from 89+10
//define number as element i of array "numbers"
//create swap method and send array "numbers"
//int at element i=a
//int at element i+1=b
//define int temp as a
//define a as b
//define b as temp
//create a second array as a parameter and send
//return
//call swap method a main method





package com.dhingra;
import java.util.*;

public class swapmethod {
    public static void main(String[] args){
        Random arraysize=new Random();
        int number= arraysize.nextInt(5)+5;
        System.out.println("You get " + number + " integers");
        int[] Randnumbers= new int[number];
        for (int i=0; i<number; i++){
            Randnumbers[i]=arraysize.nextInt(89)+10;

        }
        System.out.println(Arrays.toString(Randnumbers));
        int index1;
        int index2;
        do {
            index1 = arraysize.nextInt(number);
            index2 = arraysize.nextInt(number);
        }while (index1==index2);
        swap(Randnumbers, index1, index2);
        System.out.println(Arrays.toString(Randnumbers));
    }

    public static int[] swap(int[] Randnumbers, int i, int j)
    {
        int temp = Randnumbers[i];
        Randnumbers[i]= Randnumbers[j];
        Randnumbers[j]= temp;
        return Randnumbers;


    }
}