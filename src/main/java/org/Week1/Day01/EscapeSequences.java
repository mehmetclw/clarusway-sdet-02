package org.Week1.Day01;

public class EscapeSequences {
    public static void main(String[] args) {
        // I am from "Atlanta"
        System.out.println("I am from 'Atlanta'");
        /*
            1- Double quote : \"
            2- Single Quote : \'
            3- New Line : \n
            4- Tab : \t
            5- Backslash :  \\

         */
        /*When I use \n will second
        sentence will start in new line.
        This is first line
        This is second line

         */
        System.out.print("This is:\n first line\n");
        System.out.println("This is second line");

        /* \t is giving tab space
        This is:     first line    This is second line
         */
        System.out.println("This is:\t first line\t\t This is second tab");

        // I am using \backslash\ here
        System.out.println("I am using \\backslash\\ here ");
        System.out.println("My name is \\Andre\\");
    }
}
