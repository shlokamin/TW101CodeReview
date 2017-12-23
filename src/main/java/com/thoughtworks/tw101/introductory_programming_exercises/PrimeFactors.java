package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        TreeSet primeFactors = new TreeSet<Integer>();

        // edge case where n = 1 should return an empty list
        if (n == 1) {
            return new ArrayList<Integer>();
        }

        // keep dividing by 2 until the number is no longer even
        while (n % 2 == 0) {
            primeFactors.add(2);
            n = n/2;
        }

        int loopEnd = (int) Math.round(Math.sqrt(n));

        // now can check the rest of the primes up until the square root of n
        for (int i = 3; i <= loopEnd + 1; i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n = n/i;
            }
        }

        List<Integer> factorsToList = new ArrayList<Integer>(primeFactors);

        return factorsToList;

    }
}
