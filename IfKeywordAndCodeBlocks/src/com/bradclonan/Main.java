package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//If Keyword
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //If you are running a single statement you can remove the braces.
        if(score == 5000) {
            System.out.println("Your score was 5000");
        }

        //If Else
        if(score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Your score wasn't 5000");
        }

        //If ,else if, else
        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score > 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got to the end of the if else if");
        }

        //if continued examples
        // if (gameOver == true)
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }



    }
}
