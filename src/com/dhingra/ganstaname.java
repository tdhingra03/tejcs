package com.dhingra;
import java.util.Scanner;

public class ganstaname {
public static Scanner Keyboard= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type your name playa: ");
        String fullname= Keyboard.nextLine();
        System.out.print("your gansta name is ");
        firstinitial(fullname);
        System.out.print(". Diddy");
        lastname(fullname);
        firstname(fullname);
        System.out.print("-izzle");
    }
    public static void firstinitial(String fullname){
        char initial= fullname.charAt(0);
        System.out.print(initial);
    }
    public static void lastname(String fullname) {
        int indexspace = fullname.indexOf(" ");
        if (indexspace > 0) {
            String lastname = fullname.substring(indexspace);
            lastname = lastname.toUpperCase();
            System.out.print(lastname);
        }
    }

     public static void firstname(String fullname){
            int indexspace= fullname.indexOf(" ");
            //^try to find way so i dont have to repeat this index of space
            String firstname= fullname.substring(0, indexspace);
            System.out.print(" " + firstname);
        }
    }


