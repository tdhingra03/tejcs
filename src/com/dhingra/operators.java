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

        int totalCost = (int) Math.round(mealCost + tip + tax);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
