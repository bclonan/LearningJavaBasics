package com.bradclonan;

public class Main {

    public static void main(String[] args) {
        //Strings
        //Sequence of characters
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = myString + "33" ;
        System.out.println("The number string = " + numberString);
    }
}
