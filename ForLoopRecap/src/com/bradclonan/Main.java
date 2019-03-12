package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//For Loop Recap
        /*Structure
        init = initialise variables or variable in this case
        condition = determines when the loop ends
        increment = iterates x amount of times

        for(init; condition; increment) {

        }
         */
        //Example #1
        //The initial paramater passed into this loop is the number one
        //with each iteration the loop will add 2 to the number
        //when the number meets the condition greater than 7, it will end
        for(int number = 1; number < 7; number +=2) {
            System.out.println("number = " + number);
        }
        //Output
        //number = 1
        //number = 3
        //number = 5

        //Example #2
        int count = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + 1);
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);

    }
}
