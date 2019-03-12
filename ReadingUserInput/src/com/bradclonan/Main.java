package com.bradclonan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Reading user input using scanner
        //System.in = opposite of system.out i.e. accepts console input
        //Define Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year you were born : "); //Age Question
        //Ensure a integer was input
        boolean hasNextInt = scanner.hasNextInt();

        //if input wasnt a valid number
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();//Store user age input in int variable
            scanner.nextLine();//Handle nextline character(enter key)

            System.out.println("Enter your nickname : "); //Question

            String name = scanner.nextLine();//Store user input in the string variable

            int age = calculateUserAge(yearOfBirth);//Calculate users age with the calculateUserAge method

            //Create range of acceptable ages to fix negative numbers or false years.
            if(age >= 0 && age <= 200) {
                System.out.println("Did they really call you " + name + " or did you just make that up?" + "I mean you are " + age + " after all.");
            } else {
                System.out.println("Invalid birth year unless your over 200 years old.");
            }
        } else {
            System.out.println("Unable to parse year of birth. Please enter the year of birth using real numbers eg. 1989");
        }


        scanner.close();
    }

    public static int calculateUserAge(int birthYear) {
        int age = 2019 - birthYear;



        return age;
    }
}
