package com.thoughtworks.tw101.exercises.exercise6;

// This class implements an Orc, which are monsters that start with 20 hit points.
public class Orc implements Monster{
    private String name = "Orc";
    private int hitpoints = 20;

    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    public void reportStatus() {
        System.out.printf("Name: %s   Hitpoints: %d%n", name, hitpoints);
    }
}
