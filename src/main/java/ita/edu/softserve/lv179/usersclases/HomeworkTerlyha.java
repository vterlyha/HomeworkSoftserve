/**
 * Package for tasks solving.
 */
package ita.edu.softserve.lv179.usersclases;

import java.util.Scanner;

/**
 * Class for solving tasks 108, 325, 561 from book "Zadachi po programirovaniu".
 *
 * @version 1
 * @author  Volodymyr Terlyha
 *
 */
public final class HomeworkTerlyha {

    /**
     * Class constructor.
     */
    private HomeworkTerlyha() {
    }

    /**
     * Method finds the smallest number of format 2^r that is bigger than given natural number.
     *
     *  Parameters (naturalNumber) is entered from Command Line.
     */
    public static void solveExcercise108() {
        System.out.println("Find the smallest number of format 2^r that is bigger than given natural number");
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();
        System.out.println("Here is your number");
        int result = 1;
        while (result <= naturalNumber) {
            result *= 2;
        }
        System.out.println(result);
    }

    /**
     * Method finds simple dividers of given natural number.
     *
     *  Parameters (naturalNumber) is entered from Command Line.
     */
    public static void solveExcercise325() {
        System.out.println("Find simple dividers of given natural number");
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();
        System.out.println("Here are your dividers");
        for (int i = 2; i < naturalNumber; i++) {
            if ((naturalNumber % i) == 0) {
                int divider = 0;
                for (int a = 2; a < i - 1; a++) {
                    if ((i % a) == 0) {
                        divider++;
                    }
                }
                if (divider == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    /**
     * Method finds all natural numbers, that coincide with last numbers of its squares.
     *
     *  Parameters (naturalNumber) is entered from Command Line.
     */
    public static void solveExcercise561() {
        System.out.println("Find all natural numbers, that coincide with last numbers of its squares");
        final int modulusDividerIncrement = 10;
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();
        System.out.println("Here are your numbers");
        for (int i = 1; i <= naturalNumber; i++) {
            int length = Integer.toString(i).length();
            int modulusDivider = modulusDividerIncrement;
            for (int a = 0; a < length; a++) {
                int result = (i * i) % modulusDivider;
                if (result == i) {
                    System.out.print(result + " ");
                    break;
                }
                modulusDivider *= modulusDividerIncrement;
            }
        }
        System.out.println();
    }
}


