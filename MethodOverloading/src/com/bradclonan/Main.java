package com.bradclonan;

public class Main {

    public static void main(String[] args) {
    //Method overloading is when you use the same method name but a different number of variables
        //Methods name and method parameters are what differentiate them
        //NOTE : changing the return type doesnt change the overall "Signature"
        int newScore = calculateScore("Brad", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
