package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

// This class stores a randomly generated number between two values
public class RandomNum {
    private int number;

    public RandomNum(int min, int max) {
        Random rand = new Random();
        number = rand.nextInt((max - min) + 1) + min;
    }

    public int getNumber() {
        return number;
    }
}
