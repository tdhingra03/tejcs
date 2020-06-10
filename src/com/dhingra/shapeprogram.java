package com.dhingra;

public class shapeprogram {
    public static final int SIZE= 6;
    public static void main (String[] args){
        for (int letterlimit=SIZE; letterlimit>=1; letterlimit--){
            for (int letter=0; letter<letterlimit; letter++){
                System.out.print((char)(65+letter));

            }
            System.out.println("");
        }
        for (int letterlimit=1; letterlimit<=SIZE; letterlimit++){
            for (int letter=0; letter<letterlimit; letter++){
                System.out.print((char)(65+letter));
            }
            System.out.println("");
        }


    }
}
