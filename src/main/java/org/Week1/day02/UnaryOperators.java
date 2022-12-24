package org.Week1.day02;

public class UnaryOperators {
    public static void main(String[] args) {
        /*
                + : positive
                - : negative
                ++ : increment =>  i=i+1
                -- : decrement => i=i-1
         */
        /*
		    && : And  logic        true && true ==> true,   other wise ==> false
		    || : or  logic
		          				true  || false  ==> true
		          				true  || true   ==> true
		          				false || false  ==> false
			if both conditions are false it will return false, otherwise will return true
		 */
        // + : positive
        int i = 5;
        i = i + 5;
        System.out.println(i);
        i += 5; //i=i+5;
        System.out.println(i);

        //- : negative
        i -= 5; // i=i-5;
        System.out.println(i);

        // ++ : increment
        //post increment a++
        int x=0;
        System.out.println(x++); // output: 0
        System.out.println(x); // output : 1

        //pre-increment ++a   x=x+1
        int m=0;
        System.out.println(++m); // output: 1
        System.out.println(m); // output : 1

        // -- : decrement
        //post decrement a--  y=y-1
        int y=10;
        System.out.println(y--); // output: 10
        System.out.println(y); // output : 9

        //pre-decrement --a   y=y-1
        System.out.println(--y); // output: 8
        System.out.println(y); // output : 8

        // ! NOT operator
        boolean a=true;
        System.out.println(a);
        System.out.println(!a);


    }
}
