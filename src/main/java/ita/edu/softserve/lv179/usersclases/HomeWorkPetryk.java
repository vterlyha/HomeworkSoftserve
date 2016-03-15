package ita.edu.softserve.lv179.usersclases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class for solving tasks 182, 323, 560 from book "Zadachi po programirovaniu".
 *
 * @version 1.0
 * @author Andrew Petryk
 *
 */
public class HomeWorkPetryk {

	/**
	 * @param FIRST_DIVIDER
	 *            is used for checking if a natural number can be divided by 5.
	 */
	private static final int FIRST_DIVIDER = 5;

	/**
	 * @param SECOND_DIVIDER
	 *            is used for checking if a natural number can not be divided by
	 *            7.
	 */
	private static final int SECOND_DIVIDER = 7;

	/**
	 * Scanner to initialize variable which determinate the length of an array.
	 */
	private static Scanner sc = new Scanner(System.in);

	private HomeWorkPetryk() {

	}

	/**
	 * Solving Exercise No. 182.
	 */
	public static void solveExercise182() {

		System.out.println("Enter any Natural number: \n");
		int count = 0;
		int sum = 0;

		int arrayLength = getInt();
		int[] mas = new int[arrayLength];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = i;
		}

		for (int i : mas) {
			if (i % FIRST_DIVIDER == 0 && i % SECOND_DIVIDER != 0) {
				count++;
				sum += i;
			}
		}

		System.out.println("Summary of all needed natural numbers is: " + sum);
		System.out.println("Total amount of needed " + "natural number is: " + count);
	}

	/**
	 * Solving Exercise No. 323.
	 */
	public static void solveExercise323() {
		System.out.println("Enter your number: \n");

		int arrayLength = getInt();
		List<Integer> naturalNumbersList = new ArrayList<Integer>();

		for (int i = 1; i <= arrayLength - 1; i++) {

			if (gcd(i, arrayLength) == 1) {
				naturalNumbersList.add(i);
			}
		}

		for (Integer integer : naturalNumbersList) {
			System.out.println(integer);
		}
	}

	/**
	 * Solving Exercise No. 560.
	 */
	public static void solveExercise560() {

		List<String> friendlyNums = new ArrayList<String>();
		for (int i = 200; i <= 300; i++) {
			for (int j = 201; j < 300; j++) {
				int jDivs = sumA(j);
				int iDivs = sumA(i);
				if (i != j) {
					if (jDivs == i && iDivs == j) {
						friendlyNums.add(i + " & " + j);
					}
				}

			}
		}

		if (friendlyNums.isEmpty()) {
			System.out.println("no friendly numbers ;(");
		} else {
			for (String string : friendlyNums) {
				System.out.println(string);
			}
		}
	}

	/**
	 * Used for entering right data into Scanner
	 * 
	 * @return Integer data
	 */
	private static int getInt() {
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("You enter invalid symbol.Please, try again: ");
		}
		return sc.nextInt();
	}

	/**
	 * Used for method solveExercise323()
	 * 
	 * @param a
	 *            first natural Number
	 * @param b
	 *            second natural Number
	 * @return the amount of dividers of 'a' and 'b'
	 */
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	/**
	 * Used for method solveExercise323()
	 * 
	 * @param j
	 *            is the natural number which is segregate
	 * @return sum of all dividers of 'j'
	 */
	public static int sumA(int j) {

		int sumA = 0;
		for (int i = 1; i < j; i++) {
			if (j % i == 0) {
				sumA += i;
			}
		}

		return sumA;

	}
}
