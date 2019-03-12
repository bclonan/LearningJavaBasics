package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//Operators
        //Full list of operators
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        /*
        Summary of Operators
The following quick reference summarizes the operators supported by the Java programming language.

    Simple Assignment Operator

    =       Simple assignment operator

    Arithmetic Operators

    +       Additive operator (also used for String concatenation)
    -       Subtraction operator
    *       Multiplication operator
    /       Division operator
    %       Remainder operator

    Unary Operators

    +       Unary plus operator; indicates positive value (numbers are positive without this, however)
    -       Unary minus operator; negates an expression
    ++      Increment operator; increments a value by 1
    --      Decrement operator; decrements a value by 1
    !       Logical complement operator; inverts the value of a boolean

    Equality and Relational Operators

    ==      Equal to
    !=      Not equal to
    >       Greater than
    >=      Greater than or equal to
    <       Less than
    <=      Less than or equal to

    Conditional Operators

    &&      Conditional-AND
    ||      Conditional-OR
    ?:      Ternary (shorthand for if-then-else statement)

    Type Comparison Operator

    instanceof      Compares an object to a specified type

    Bitwise and Bit Shift Operators

    ~       Unary bitwise complement
    <<      Signed left shift
    >>      Signed right shift
    >>>     Unsigned right shift
    &       Bitwise AND
    ^       Bitwise exclusive OR
    |       Bitwise inclusive OR




         */
        //Major Java operators
        // "=" anything to right
        // "+" addition of two numbers
        // "-" subtraction of two numbers
        // "*" multiplication of two numbers
        // "/" division of two numbers
        // "%" Divides two numbers
        // "++" increment operator
        // "--" Decrement operator
        int result = 1 + 2;
        System.out.println("1 + 2 = " +result);

        int previousResult = result;

        result = result - 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);



        //Additional Operators
        // "==" equal conditional
        // "!=" not equal to
        // "<" Less than
        // "<=" less than or equal to
        // ">" Greater than
        // ">=" greater than or equal to
        // "&&" and (both conditions must be true)
        // "||" or
        boolean isPotato = false;
        if (isPotato == true)
            System.out.println("Is not a potato!");

        int topScore = 100;
        int secondTopScore = 95;
            if(topScore == 100)
                System.out.println("You got the high score!");
            if(topScore != 100)
                System.out.println("You got the high score!");
            if(topScore > 100)
                System.out.println("You got the high score!");
            if(topScore >= 100)
                System.out.println("You got the high score!");
            if(topScore <= 100)
                System.out.println("You got the high score!");
            if(topScore < 100)
                System.out.println("You got the high score!");
            if(topScore > secondTopScore && topScore < 100)
                System.out.println("Greater than top score and less than 100");
            if((topScore > secondTopScore) && (topScore < 100))
                System.out.println("Greater than top score and less than 100");
            if(topScore > 90 || secondTopScore >=1111)
                System.out.println("One of these conditions is true");
            if((topScore > 90) || (secondTopScore <=90))
                System.out.println("One of these conditions is true");

        //Tertiary operator
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        /* Challenge
        1. Create a double variable with the value of 20
        2. Create a second variable of type double with the value 80
        3. Add both numbers and multiply by 25
        4. Use the remander operator to figure out the remainder from the sum of #3 divided by 40
        5. Write an "if" statement that displays a message "Total was over the limit"
        // if the remaining total (#4) is equal to 20 or less
        //Java order of precedence table
        // http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        */
        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotal = 0;
        double theRemainder = 0;
        myTotal = 25 * (myFirstValue + mySecondValue);
        System.out.println(myTotal);
        theRemainder = myTotal % 40;
        System.out.println("The Remainder is " + theRemainder);
        if (myTotal <= 0)
            System.out.println("Total was over the limit");


    }
}
