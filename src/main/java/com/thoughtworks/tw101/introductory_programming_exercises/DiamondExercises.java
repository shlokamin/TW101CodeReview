package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    private static String addPart(int numSpaces, String symbol) {
        // This function adds the appropriate number of spaces or asterisks to the string.
        String spaces = "";

        for (int i = 0; i < numSpaces; i++) {
            spaces += symbol;
        }

        return spaces;
    }

    private static String makeLine(int numSpaces, int numStars) {
        // This function draws one line.
        String str = "";

        str += addPart(numSpaces, " ");
        str += addPart(numStars, "*");
        str += addPart(numSpaces, " ");

        return str;
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        // the total number of spaces is the current odd number (2n-1)
        int numSpaces = 2 * n - 1;

        for (int i = 1; i < n + 1; i++) {
            int currOdd = 2 * i - 1;
            int sideSpaces = (numSpaces - currOdd) / 2;
            String triangle = "";

            triangle += makeLine(sideSpaces, currOdd);

            System.out.println(triangle);

        }

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n); // prints top half of diamond

        int numSpaces = 2 * n - 1;

        for (int i = n - 1; i > -1; i--) {
            int currOdd = 2 * i - 1;
            int sideSpaces = (numSpaces - currOdd) / 2;
            String triangle = "";

            triangle += makeLine(sideSpaces, currOdd);

            System.out.println(triangle);

        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int numSpaces = 2 * n - 1;

        // prints top half of diamond
        for (int i = 1; i < n; i++) {
            int currOdd = 2 * i - 1;
            int sideSpaces = (numSpaces - currOdd) / 2;
            String triangle = "";

            triangle += makeLine(sideSpaces, currOdd);

            System.out.println(triangle);
        }

        // prints name
        int sideSpaces = (numSpaces - "Emily".length()) / 2;
        String name = "";

        name += addPart(sideSpaces, " ");
        name += "Emily";
        name += addPart(sideSpaces, " ");

        System.out.println(name);

        // prints bottom of diamond
        for (int i = n - 1; i > -1; i--) {
            int currOdd = 2 * i - 1;
            sideSpaces = (numSpaces - currOdd) / 2;
            String triangle = "";

            triangle += makeLine(sideSpaces, currOdd);

            System.out.println(triangle);

        }
    }
}
