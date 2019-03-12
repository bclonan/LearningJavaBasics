package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//While Statement
        //Loop until statement = true or false
        //While Loop Structure
        /*
        while(condition) {

        }

        //Do while loop structure

        do {

        } while (condition);
         */
        //Example #1
        int count = 1;
        while(count != 6) {
            System.out.println("While : Count value is " + count);
            count++;
        }
        //Example #1 written differently

        count = 1;//Reset Count
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("While v2 : Count value is " + count);
            count++;
        }
        //Example #1 as a for statement
        for(count = 1; count != 6; count++) {
            System.out.println("For : Count value is " + count);
        }

        //Example #2 do/while statement
        //TIP : Do statement is guaranteed to execute at least once so if you set count to 6 you will get an infinite loop
        count = 1;//Reset count
        do {
            System.out.println("Do While : Count value was " + count);
            count++;
        } while (count != 6);

        //Example #2 do/while statement With Break
        count = 6;//Reset count
        do {
            System.out.println("Do While v2: Count value was " + count);
            count++;

            if(count >100){
                break;
            }

        } while (count != 6);

        //Challenge
        //Create a method called isEvenNumbner that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is an even number
        // return true if an even number, otherwise return false
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
            System.out.println("Even Number " + number);
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    //isEvenNumberMethod
    public static boolean isEvenNumber(int theNumber) {


        //Approach #1 if statement
        if((theNumber % 2) == 0){
            return true;
        } else {
            return false;
        }

    }
}
