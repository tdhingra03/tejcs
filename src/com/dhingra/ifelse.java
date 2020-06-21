package com.dhingra;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("type your weight");
        weight=number.nextDouble();
        System.out.println("type your height");
        height=number.nextDouble();
        double BMI= ((weight/(height*height))*703);
        System.out.println("your BMI is "+ ((weight/height*height)*703));

        if (BMI<18.5)
        {
            System.out.println("You are underweight");
        }
        if (BMI>=18.5 && BMI<=25)
        {
            System.out.println("You are normal");
        }
        if (BMI>=25 && BMI<=29.9)
        {
            System.out.println("You are overweight");
        }
        if (BMI>=30.0)
        {
            System.out.println("You are obese");
        }


    }

}
