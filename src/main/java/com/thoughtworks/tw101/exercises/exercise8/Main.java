package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise7.GuessNumber;
import com.thoughtworks.tw101.exercises.exercise7.RandomNum;

public class Main {
    public static void main(String[] args) {
        RandomNum num = new RandomNum(1, 100);
        UpdatedGuessNumber game = new UpdatedGuessNumber(num.getNumber());

        while(game.getKeepPlaying()) {
            game.getGuess();
            game.checkNumber();
        }
    }
}
