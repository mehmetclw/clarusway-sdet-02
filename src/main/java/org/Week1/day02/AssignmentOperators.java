package org.Week1.day02;

public class AssignmentOperators {

    // Assignment Operators or ShortHanded Operators
    /**     Assign right value to the left
            Operator	Example	    Equivalent to
                =	    a = b;	    a = b;
                +=	    a += b;	    a = a + b;
                -=	    a -= b;	    a = a - b;
                *=	    a *= b;	    a = a * b;
                /=	    a /= b;	    a = a / b;
                %=	    a %= b;	    a = a % b;

     */
    public static void main(String[] args) {
        int a=10, b=20;
        int c=30;
        int d=40;
        System.out.println("initial a value = " + a);
        a=b;
        System.out.println("later a value = " + a);
        c += d; // c=c+d
        c *=d; // c = c*d
        c /= d; // c= c/d
        System.out.println(c);

    }
}
