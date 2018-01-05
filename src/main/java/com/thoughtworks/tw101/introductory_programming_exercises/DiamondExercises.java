package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(5);
    }

    private static String addSymbol(int numSpaces, String symbol) {
        String spaces = "";

        for (int i = 0; i < numSpaces; i++) {
            spaces += symbol;
        }

        return spaces;
    }
    private static String makeLine(int numSpaces, int numStars) {
        String str = "";

        str += addSymbol(numSpaces, " ");
        str += addSymbol(numStars, "*");
        str += addSymbol(numSpaces, " ");

        return str;
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        String[] triangle = getIsoscelesTriangle(n);
        for (String row: triangle) {
            System.out.println(row);
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

        String[] triangle = getIsoscelesTriangle(n);

        for (int i = 0; i <triangle.length ; i++) {
            System.out.println(triangle[i]);
        }
        for (int i = (triangle.length) - 2; i>=0; i--) {
            System.out.println(triangle[i]);
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

        String[] triangle = getIsoscelesTriangle(n-1);

        for (int i = 0; i <triangle.length ; i++) {
            System.out.println(triangle[i]);
        }

        printNameWithSpaces("Emily",n);

        for (int i = (triangle.length) - 1; i>=0; i--) {
            System.out.println(triangle[i]);
        }

    }

    private static String[] getIsoscelesTriangle(int height) {
        String[] triangle = new String[height];
        for (int i = 0; i < height ; i++) {
            int currOdd = 2 * i + 1;
            int sideSpaces = ((2 * height - 1) - currOdd) / 2;
            String currLine = "";
            currLine += makeLine(sideSpaces, currOdd);
            triangle[i] = currLine;
        }
        return triangle;
    }


    private static void printNameWithSpaces(String name, int n) {
        int sideSpaces = ((2 * n - 1) - name.length() - 1) / 2;
        String res = "";
        res += addSymbol(sideSpaces, " ");
        res += name;
        res += addSymbol(sideSpaces, " ");
        System.out.println(res);

    }
}
