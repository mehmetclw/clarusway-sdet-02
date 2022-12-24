package org.Week1.day02;

public class RelationalOperator {
    public static void main(String[] args) {

        /*
                > : Greater than
                >=: Greater than or equal to
                < : Less than
                <= : Less than or equal to
                == : equal to
                != : not equal to

                && : AND
                || : OR

         */
        // = : Assignment : int i =4;

        System.out.println(9 > 10); // false
        System.out.println(10 >= 10); //true
        System.out.println(9 < 10); //true
        System.out.println(25 <= 0); //false
        System.out.println(5 == 5); //true
        System.out.println(10 != 8); //true
        System.out.println(2 != 2);//false

        int a = 5, b = 3;
        boolean result = a > b;
        System.out.println(result);

        boolean x = 5 >= 8;
        System.out.println(x);

        boolean c = !false != !true; // true != false => true
        System.out.println("Result is : " + c);

        boolean f = 10 > 9 == 9 < 10; // true == true => true
        System.out.println("F is " + f);

        boolean d = 100 == 100;
        System.out.println(d);

        boolean w = 10 > 9 || 9 > 10 || 5 == 3; //true || false => in OR condition it checks one of the true value only
        System.out.println(w);

        boolean t = 10 > 9 && 9 > 10 && 5 == 5; // in AND condition it checks both needs to be true
        System.out.println(t);
        System.out.println("============");
        /*Using the “==” operator for comparing text values is one of the most common mistakes Java beginners make.
        This is incorrect because “==” only checks the referential equality of two Strings,
        meaning if they reference the same object or not.*/
        //TODO Explain this part
        String name = "FS01";
        String name1 = "FS01";
        boolean check = name1 == name;
        System.out.println(check); // false
        String language = "I love coding java";
        String java = "I love coding java";
        boolean results = language == java;
        System.out.println(results); // true
        String newValue = new String();
        newValue = "I love coding java";
        System.out.println("newValue==java = " + newValue == java);


    }
}
