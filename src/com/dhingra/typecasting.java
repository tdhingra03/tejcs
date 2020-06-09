package com.dhingra;

public class typecasting {
    public static void main(String[] args) {
        double num1 = 9.7;
        int num2 = 5;
        double total;
        int total2;
        //total= num1+num2;
        //System.out.println(total);
        //total2= num2+(int)num1;
        //System.out.println(total2);
        char letter = 20;
        for (int let = 0; let < 4; let++) {
            for (int line = 0; line < 25; line++) {
                System.out.print((char) (letter + line) + " ");

            }
            System.out.println();
            letter += 25;
        }
    }
}


