package org.Week1.day02;

public class PrimitiveDataTypes2 {
    public static void main(String[] args) {
        //float
        float myFloatNumber= 2344.45567f; //we defined variable called myFloatNumber
        System.out.println(myFloatNumber);
        System.out.println("The total calculation is : " + myFloatNumber);
        System.out.println("The total " + myFloatNumber + "$");
        System.out.println("===================================");

        //double
        double number=123.456;
        System.out.println(number);
        System.out.println("The winning number is : "+number);
        System.out.println("===================================");


        //char
        char firstLetter='A';
        System.out.println(firstLetter);
        int letter='A';
        System.out.println("The numeric value of A is "+letter);
        char numbers= 188;
        System.out.println("Then number 98 is equal to "+numbers);
        System.out.println("===================================");
        //mix examples
        double doubleNumber=99.99;
        float floatNumber= 334.56f;
        double totals=doubleNumber+floatNumber;
        System.out.println(totals);

    }
}
