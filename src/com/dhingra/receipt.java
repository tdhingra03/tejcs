package com.dhingra;

public class receipt {
    public static final int TAX= .08;
    public static final int TIP= .15;
    public static void main(String[] args){

        double price1 = 38;
        double price2 = 40;
        double price3 = 30;
        double subtotal = price1 + price2 + price3;
        final double TAX= .08;
        final double TIP= .15;
        double finalprice= subtotal+ (subtotal*TAX)+ (subtotal*TIP);
        double finalTAX= subtotal*TAX;
        double finalTIP= subtotal*TIP;


        System.out.println("Subtotal:"+subtotal);
        System.out.println("TAX:"+finalTAX);
        System.out.println("TIP:"+finalTIP);
        System.out.println("TOTAL:"+finalprice);



    }



}




