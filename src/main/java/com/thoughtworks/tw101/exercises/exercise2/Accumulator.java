package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int numIncrement = 0;

    void increment() {
        // This method counts the number of times it is called.
        numIncrement += 1;
    }

    void total() {
        // This method prints the total number of times increment() is called.
        System.out.printf("increment() has been called %d times.%n", numIncrement);
    }
}
