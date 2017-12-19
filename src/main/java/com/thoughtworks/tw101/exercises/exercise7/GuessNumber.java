package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

// This class stores the actual number and the number that the user guesses, and the methods that allow the user to
// play a number-guessing game.
public class GuessNumber {
    private int actualNum;
    private int userGuess;
    private boolean keepPlaying = true;
    private Scanner reader = new Scanner(System.in);

    public GuessNumber(int num) {
        actualNum = num;
    }

    public boolean getKeepPlaying() {
        return keepPlaying;
    }

    public void getGuess() {
        // This function gets the user input and sets it equal to userGuess.
        System.out.printf("Please enter a number: ");
        userGuess = Integer.parseInt(reader.next());
    }

    public void checkNumber() {
        // This function checks to see if the user guessed the right number
        if (userGuess == actualNum) {
            System.out.printf("You win! The correct number was %d.%n", actualNum);
            keepPlaying = false;
            reader.close();
        }
        else if (userGuess < actualNum) {
            System.out.printf("The number you guessed (%d) is too low.%n%n", userGuess);
        }
        else {
            System.out.printf("The number you guessed (%d) is too high.%n%n", userGuess);
        }
    }
}
