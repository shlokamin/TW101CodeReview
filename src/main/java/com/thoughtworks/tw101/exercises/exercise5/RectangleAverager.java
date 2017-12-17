package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.area();
        }

        return sum/rectangles.length;
    }
}
