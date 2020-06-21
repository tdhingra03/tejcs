//Tej Dhingra- operator challenge
//import scanner
//create scanner object
//define variables, mealCost, tipPercent, taxPercent
//println input meal cost
//use nextDouble to initialize variable for meal cost
//println input tip percent
//use nextInt to initialize variable for tip percent
//println input tax percent
//use nextInt to initialize variable for tax percent
//create new tip variable which is total cost of meal times tip percent
//^^do the same for tax
//define variable of total cost to be the meal cost plus tip and tax
//make sure to use Math.round to round total cost to nearest whole number
//println what the total cost of the meal is


        package com.dhingra;

import java.util.*;

public class operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost;
        int tipPercent;
        int taxPercent;
        System.out.println("Type your meal cost");
        mealCost= scan.nextDouble();
        System.out.println("Type your tip percent");
        tipPercent= scan.nextInt();
        System.out.println("Type your tax percent");
        taxPercent= scan.nextInt();


        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double totalCost = (int) Math.round(mealCost + tip + tax);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
