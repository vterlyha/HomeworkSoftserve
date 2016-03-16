
package ita.edu.softserve.lv179.usersclases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Class for solving home tasks and presentation solutions
 *
 * @author Dora
 * @version 1.0
 * @since 16.03.2016
 */
public class HomeWorkBondar {

    /**
     * The technique for calculation sum of last n numbers of numder m
     *
     * @param m a big natural number whitch will be calulation sum for
     * @param n a number of last numerals of number m
     * @return sum of last n numbers of numder m
     * @throws IllegalArgumentException
     */
    public static int calculateSumDivTask87(int m, int n) throws IllegalArgumentException {


        if (n <= 0) {
            throw new IllegalArgumentException("'n'(" + n + ") must be bigger than 0.");
        }

        int sum = 0;
        int tmp_m = m;
        int i = n;
        while (tmp_m > 0 && i > 0) {
            int t = tmp_m / 10;
            sum += tmp_m - (t * 10);
            tmp_m = t;
            i--;
        }
        if (i > 0) {
            throw new IllegalArgumentException("'n'(" + n + ") can not exceed the number of digits in the number of 'm'(" + m + ").");
        }
        return sum;
    }

    /**
     * The technique for determining whether the numbers are coprime
     *
     * @param x prime number
     * @param y natural number for checking if it is coprime number with x
     * @return boolean(is coprime number or is not coprime number)
     */
    public static boolean isRelativelyPrimeTask323(int x, int y) {
        List<Integer> dividers_x = new ArrayList<Integer>();
        List<Integer> dividers_y = new ArrayList<Integer>();
        int di = 0;
        for (int i = 2, j = 2; i <= x && j <= y; j++, i++) {
            if (i <= x)
                if (x % i == 0) {
                    dividers_x.add(i);
                    di++;
                }
            if (j <= y) {
                if (y % j == 0)
                    dividers_y.add(j);
            }
            if (di > 0) {
                if (dividers_y.contains(dividers_x.get(di - 1))) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * The technique for determining whether the number is prime
     *
     * @param number a number for checking
     * @return result of checking (true or false)
     */
    public static boolean isPrimeNumberTask559(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    /**
    * The technique for presentation of solving task#87
     */
    public static void showTask87() {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int m = random.nextInt(Integer.MAX_VALUE);
            int n = random.nextInt(20);
            try {
                int res = calculateSumDivTask87(m, n);
                System.out.println("Test2[" + i + "]: m = " + m + "; n = " + n + "; res = " + res);
            } catch (IllegalArgumentException e) {
                System.err.println("Throw2[" + i + "]: m = " + m + "; n = " + n);
            }
        }
    }

    /**
    * The technique for presentation of solving task#323
    */
    public static void showTask323() {
        StringBuilder sb = new StringBuilder();
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            n = scanner.nextInt();
        }
        while (n <= 1);
        for (int i = 2; i < n; i++) {
            if (!isRelativelyPrimeTask323(i, n))
                sb.append(i + " ");
        }
        if (sb.toString().equals("")) {
            System.out.println("There are no relatively primes :(");
        } else {
            System.out.println("All relatively primes for " + n + " are:\n" + sb);
        }
    }

    /**
     * The technique for presentation of solving task#559
    */
    public static void showTask559() {
        int n;
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter your number: ");
        n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if (isPrimeNumberTask559(i)) {
                if (Math.pow(2, i) - 1 < n) {
                    sb.append(((int) Math.pow(2, i) - 1) + " ");
                }
            }
        }
        if (sb.toString().equals("")) {
            System.out.println("There are no Mersenn numners less then " + n);
        } else {
            System.out.println("Mersenn numners less then " + n + " are \n" + sb.toString());
        }

    }
}

