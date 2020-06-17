//6/16/20
//import scanner
//declare 3 variables (int, double, string)
//declare second set of 3 variables (int, double, string)
//println ask user to input int
//save that to variable
//println ask user to input double
//save that to variable
//println ask user to input string
//save that to variable
//make int calculation
//make double calculation
//merge strings and println







import java.util.*;
public class datatype {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "Greenhill";



        int ia;
        double db;
        String sc;
        System.out.println("type your integer");
        ia = number.nextInt();
        System.out.println("type your double");
        db = number.nextDouble();
        System.out.println("type your phrase");
        number.nextLine();
        sc = number.nextLine();
        System.out.println(i + ia);
        System.out.println(d + db);
        System.out.println(s + " " + sc);

        number.close();
    }
}