package org.Week1.Day01;

import java.util.Scanner;

public class Timer {
    /**
     *
     * @param args
     */
    public static void main(String[] args)  {
        //This scanner is to get input from user via keyboard
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the minutes");
        int minutes=scan.nextInt();
        /**
         * "I love coding hava"
         * "java"
         */
        for (int i=minutes; i > 0 ;--i) {
            //Check if the i is less then zero then quit
            if( i< 0 )
                break;
            for (int z=59; z >0 ; --z) {
                System.out.println((i-1)+" minutes : "+z+"second left");
                int k=0;
                try {
                    Thread.sleep(1000);
                }catch(Exception e) {}
            }

        }
        //System.out.println(k);
        System.out.println(" \n \t \t********************************************* ");
        System.out.println("  \t \t***                                       *** ");
        System.out.println("   \t \t***  Times is Up, Please take your seats! *** ");
        System.out.println("     \t***                                       *** ");
        System.out.println("      \t********************************************* ");

    }

}