package org.Week1.day02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
            + : addition : adding two or more numbers.
            - : subtraction
            * : multiplication
            / : division
            % : Remainder :The modulo operator % computes the remainder. When a = 7 is divided by b = 4, the remainder is 3.
         */

      /* Another way of defining the variables other than below ones.
       int number1= 35;
        int number2=45;
        int addition;
        int subs;
        int multiplication;
        int division;
        int remainder;*/

        int number1 = 35, number2 = 45, addition; // you can group the same data types.
        int subs, multiplication , remainder;
        double division, division1, division2;
        double number3=35;
        double number4=45;

        // Adding two numbers
        addition = number1 + number2;
        System.out.println(number1 + "+" + number2 + " is equal to " + addition);

        //Subtracting two numbers
        subs = number2 - number1;
        System.out.println("The Subtraction value is  : " + subs);

        //Multiplication of two numbers
        multiplication=number1*number2;
        System.out.println("Multiplication of two number is : "+multiplication);

        //Division of two numbers
        System.out.println(number3 +" "+number4);
        //Expected result is : 1.2857142857142858
        division= number4/number1; // double/integer = double result
        division1= number2/number3; // integer/double = double result
        division2= number2/number1; // integer/integer = integer result

        System.out.println("Division of two number is : "+division);
        System.out.println("Division1 of two number is : "+division1);
        System.out.println("Division2 of two number is : "+division2);

        //Remainder %
        int remainderValue= 15%3;
        System.out.println(remainderValue);

        int x= 237%37;
        int y= x%2;
        System.out.println("The x is "+x +" and the y is "+y);

        for(int i=0;i<50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Other examples:
        int t= 3*5*6;
        System.out.println(t);
        // BODMAS or PEMDAS => (2+3)*2-2+3=> 5*2-2+3=>10-2+3=>10+1=>11

        /**
         * Couple of more examples
         */
        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

    }
}
