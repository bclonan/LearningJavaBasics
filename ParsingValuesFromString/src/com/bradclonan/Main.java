package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//Parsing values from strings

        /////////Strings To Ints///////////

        //Example 1 : Number as a string
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        //Example 2 : String to number with parseInt
        //Integer. is a wrapper class that contains helpful methods such as parseInt
        //parseInt is a static method that allows us to parse a string into an integer
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        //Comparison Outputs
        numberAsString += 1;
        number += 1;
        System.out.println("String Version + 1 = " + numberAsString);
        System.out.println("parseInt Version + 1 = " + number);

        /////////Strings To Doubles///////////
        numberAsString = "2018.125";
        //Example 3 : String to double with parseDouble
        //Double. is a wrapper class that contains helpful methods such as parseDouble
        //parseDouble is a static method that allows us to parse a string into an double
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Double Number = " + doubleNumber);

        //comparison outputs
        numberAsString += 1;
        doubleNumber += 1;
        System.out.println("String v2 Version + 1 = " + numberAsString);
        System.out.println("parseDouble Version + 1 = " + doubleNumber);


    }
}
