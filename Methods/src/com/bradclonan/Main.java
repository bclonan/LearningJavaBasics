package com.bradclonan;

public class Main {
    //Methods
    //Method "main"
    public static void main(String[] args) {
        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //Call calculate score method
        calculateScore(gameOver, score, levelCompleted, bonus);
        //Pass alternative scores

        score = 800;
        levelCompleted = 5;
        bonus = 100;
        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    //New Method = calculateScore
    //When declaring/creating new methods you must use the keywords public static
    //Data type and name of variable has to passed to methods when passing parameters
    //if you use "void" you are telling the method not to return any info
    //to return data you must define the type of data you'll be returning and replace void with it
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // With else method
/*        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            int finalScore = -1;
            return finalScore;
        }*/
        //Without Else Statement
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;


    }

}
