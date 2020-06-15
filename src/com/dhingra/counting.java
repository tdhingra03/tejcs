package com.dhingra;
import java.util.Scanner;
public class counting {
    public static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type your message");
        String usermessage = userinput.nextLine();
        String firstword = firstword(usermessage);
        int messagelength = firstword.length();
        System.out.println(" first word is" + messagelength + "characters long");
        char letter = 0;
        int count = 0;
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = usermessage.substring(index + 1);
                messagelength = temp.indexOf(letter);
                while (messagelength >= 0) {
                    count++;
                    temp = temp.substring(messagelength + 1);
                    messagelength = temp.indexOf(letter);
                }
                firstword = firstword.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }
        restprog(letter, usermessage, count);
    }

    public static int restprog(char letter, String usermessage, int count) {
        int indexOf2 = usermessage.indexOf(" ");
        usermessage = usermessage.substring(indexOf2, usermessage.length());
        System.out.println(usermessage);
        return count;
    }

    public static String firstword(String usermessage) {

        int indexOf = usermessage.indexOf(" ");
        String firstword = usermessage.substring(0, indexOf + 1);
        System.out.print(firstword);
        return firstword;
    }
}








