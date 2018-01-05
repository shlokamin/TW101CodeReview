package com.thoughtworks.tw101.exercises.exercise8;
import java.util.ArrayList;
import java.util.Scanner;

// This class extends GuessNumber by keeping a record of all the user's guesses, and handling the case in which the user
// enters in a string instead of a number.
public class UpdatedGuessNumber {
    private int actualNum;
    private int userGuess;
    private boolean gameOver = false;
    private Scanner reader = new Scanner(System.in);
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    public UpdatedGuessNumber(int num) {
        actualNum = num;
    }

    public boolean isOver() {
        return gameOver;
    }

    public void getGuess() {
        while(true) {
            try {
                System.out.printf("Please enter a number: ");
                userGuess = Integer.parseInt(reader.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Cannot convert that to an integer.");
            }
        }
        guesses.add(userGuess);
    }

    public void checkNumber() {
        if (userGuess == actualNum) {
            System.out.printf("You win! The correct number was %d.%n", actualNum);
            endGame();
        }
        else if (userGuess < actualNum) {
            System.out.printf("The number you guessed (%d) is too low.%n%n", userGuess);
        }
        else {
            System.out.printf("The number you guessed (%d) is too high.%n%n", userGuess);
        }
    }

    public void endGame() {
        gameOver = true;
        reader.close();
        printGuesses();
    }
    public void printGuesses() {
        String allGuesses = "";
        for (int guess : guesses) {
            allGuesses += guess + " ";
        }
        System.out.printf("All your guesses: %s%n", allGuesses);
    }
}
