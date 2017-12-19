package com.thoughtworks.tw101.exercises.exercise6;

// This class implements a Troll, which are monsters that start with 40 hit points and take half damage.
public class Troll implements Monster {
    private String name = "Troll";
    private int hitpoints = 40;

    public void takeDamage(int amount) {
        hitpoints -= amount/2;
    }

    public void reportStatus() {
        System.out.printf("Name: %s   Hitpoints: %d%n", name, hitpoints);
    }
}
