/**
 * Package for tasks solving.
 */
package ita.edu.softserve.lv179.usersclases;

import java.util.ArrayList;
import java.util.List;
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
     * Parameter put by user.
     */
    private static int userInput;

    /**
     * Scanner is used to set the info entered by user.
     */
    private static Scanner sc = new Scanner(System.in);

    /**
     * Class constructor.
     */
    private HomeworkTerlyha() {
    }

    /**
     * Method solves task 108.
     */
    public static void solveExcercise108() {
            System.out.println("Find the smallest number of format 2^r that is bigger than given natural number");
            userInput = validateInputInformation();
            System.out.println("Here is your number: " + HomeworkTerlyha.findNumberForTask108(userInput));
    }

    /**
     * Method solves task 325.
     */
    public static void solveExcercise325() {

            System.out.println("Find simple dividers of given natural number");
            userInput = validateInputInformation();
            System.out.println("Here are your dividers: " + HomeworkTerlyha.findDividersForTask325(userInput));


    }

    /**
     * Method solves task 561.
     */
    public static void solveExcercise561() {
        System.out.println("Find all natural numbers, that coincide with last numbers of its squares");
        userInput = validateInputInformation();
        System.out.println("Here are your numbers: " + HomeworkTerlyha.findNaturalNumbersForTask561(userInput));
    }

    /**
     * Method used in solveExcercise108().
     *
     * @param naturalNumber natural number that is entered from console.
     * @return returns all natural numbers, that coincide with last numbers of its squares.
     */
    public static int findNumberForTask108(int naturalNumber) {
        int result = 1;
        while (result <= naturalNumber) {
            result *= 2;
        }
        return result;
    }

    /**
     * Method used in solveExcercise325().
     *
     * @param naturalNumber natural number that is entered from console.
     * @return returns simple dividers of given natural number.
     */
    public static List<Integer> findDividersForTask325(int naturalNumber) {
        List<Integer> simpleDividers = new ArrayList<Integer>();
        for (int i = 2; i < naturalNumber; i++) {
            if ((naturalNumber % i) == 0) {
                int divider = 0;
                for (int a = 2; a < i - 1; a++) {
                    if ((i % a) == 0) {
                        divider++;
                    }
                }
                if (divider == 0) {
                    simpleDividers.add(i);
                }
            }
        }
        return simpleDividers;
    }

    /**
     * Method used in solveExcercise561().
     *
     * @param naturalNumber natural number that is entered from console.
     * @return returns all natural numbers, that coincide with last numbers of its squares.
     */
    public static List<Integer> findNaturalNumbersForTask561(int naturalNumber) {
            final int modulusDividerIncrement = 10;
            List<Integer> naturalNumbers = new ArrayList<Integer>();
            for (int i = 1; i <= naturalNumber; i++) {
                int length = Integer.toString(i).length();
                int modulusDivider = modulusDividerIncrement;
                for (int a = 0; a < length; a++) {
                    int result = (i * i) % modulusDivider;
                    if (result == i) {
                        naturalNumbers.add(result);
                        break;
                    }
                    modulusDivider *= modulusDividerIncrement;
                }
            }
            return naturalNumbers;
    }

    /**
     * Method used to validate input information.
     *
     * @return returns information, that was inputed by user.
     */
    private static int validateInputInformation() {
        do {
            System.out.println("Please enter a natural number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            userInput = sc.nextInt();
        } while (userInput <= 0);
        return userInput;
    }

}


