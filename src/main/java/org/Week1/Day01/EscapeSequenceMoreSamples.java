package org.Week1.Day01;

public class EscapeSequenceMoreSamples {
    public static void main(String[] args) {
            /*Single quote : '\''
            Double quote : '\"'
            Backslash : '\\'
            Newline : '\n'
            Backspace : '\b'
            Tab : '\t'

            */

        System.out.println("Welcome to \'CLARUSWAY SDET Course\'.");
        System.out.println("Welcome to \"CLARUSWAY SDET Course\".");

        System.out.println("This is for BACK SLASH \\ BUTTON");
        System.out.print("\nThis is starting in new line");

        System.out.println("This" + "\r is an implementation " + "of Carriage Return");

        System.out.println("This is for BACKSPACE \bBUTTON");
        System.out.println("This is for NO-BACKSPACE BUTTON");

        System.out.println("This" + "\f is an" + " implementation of " + "formfeed");

        System.out.println("Escape Sequences :" + "\tThis is for TAB");

        System.out.print("Escape Sequences :" + "This is without TAB");

        /*
        dsjhdas;dhsajk 'dhas' ljkhds a
        sdahjsd;ajksdajkshd;ajsdajksd
        hs;dhsajdkhsajkdh" Sdasdas" djsdhaskjdh
        \butrasi\               dkjajddsalkjdaslkd
        jdlksjdskaljdsakldj dkasjdklsad
         */
        System.out.println("dsjhdas;dhsajk \'dhas\' ljkhds a");
        System.out.println("hs;dhsajdkhsajkdh\" Sdasdas\" djsdhaskjdh");
        System.out.println("\\butrasi\\\t\t\t\t\tdkjajddsalkjdaslkd");

    }
}
