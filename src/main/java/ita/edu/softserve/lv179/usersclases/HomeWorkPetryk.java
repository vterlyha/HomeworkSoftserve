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
	 * 
	 * @return int data: naturalN
	 */
	public static int returnNaturalNumber() {

		System.out.println("Enter your number: ");
		int naturalN = getInt();

		return naturalN;

	}

	/**
	 * Solving Exercise No. 182.
	 * 
	 * @param naturalNumber
	 * @return String
	 */
	public static String solveExercise182(int naturalNumber) {

		int count = 0;
		int sum = 0;

		int[] mas = new int[naturalNumber];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = i;
		}

		for (int i : mas) {
			if (i % FIRST_DIVIDER == 0 && i % SECOND_DIVIDER != 0) {
				count++;
				sum += i;
			}
		}

		return "Sum is " + sum + " Total is " + count;
	}

	/**
	 * Print the results of Exercises.
	 * 
	 * @param list
	 */
	public static void printResult(List<?> list) {

		for (Object object : list) {
			System.out.println(object);
		}
	}

	/**
	 * Solving Exercise No. 323.
	 * 
	 * @param naturalNumber
	 * @return List<Integer>
	 */
	public static List<Integer> solveExercise323(int naturalNumber) {

		List<Integer> naturalNumbersList = new ArrayList<Integer>();

		for (int i = 1; i <= naturalNumber - 1; i++) {

			if (gcd(i, naturalNumber) == 1) {
				naturalNumbersList.add(i);
			}
		}

		return naturalNumbersList;
	}

	/**
	 * Solving Exercise No. 560.
	 * 
	 * @return List<String>
	 */
	public static List<String> solveExercise560() {

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

		return friendlyNums;
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
	 * @return the amount of dividers of @param a and @param b.
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
	 * @return sum of all dividers of @param j
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
