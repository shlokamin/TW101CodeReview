package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        // This function returns the sum of all all integers between start and end.
        int sum = 0;

        for (int i = start; i <= end; i += 2) {
            sum += i;
        }
        return sum;
    }
}
