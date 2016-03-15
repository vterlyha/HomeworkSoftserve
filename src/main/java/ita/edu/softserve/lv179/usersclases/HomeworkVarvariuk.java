package ita.edu.softserve.lv179.usersclases;

import java.util.Scanner;
import java.util.*;

public class HomeworkVarvariuk {
	
	public static int calculateCounterTask86a(int num) {
		int number = num;
		int counterTask1 = 0;
		while ((number % 10) != 0) {
			number = number / 10;
			counterTask1++;
		}
		return counterTask1;
	}
	
	public static int calculateSumTask86b(int num) {
		int number = num;
		int sum = number % 10;
		while ((number % 10) != 0) {
			number = number / 10;
			sum += number % 10;
		}
		return sum;
	}
	
	public static String findAllPerfectNumbersTask330(int num) {
		String perfectNumbers = "";
		int perfectSum = 0;
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < i; j++) {
				if ((i % j) == 0) {
					perfectSum += j;
				}
			}
			if (perfectSum == i) {
				perfectNumbers += i + ", ";
			}
			perfectSum = 0;
		}
		return perfectNumbers;
	}
	
	public static void solveExercise86a() {
		System.out.println("Write down positive integer; ");
		System.out.println("how many digits does it contain?:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("The counter is: " 
		+ calculateCounterTask86a(sc.nextInt()));
	}

	public static void solveExercise86b() {
		System.out.println("Write down positive integer; ");
		System.out.println("What is the sum of it's digits?:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("The sum is: " + calculateSumTask86b(sc.nextInt()));
	}

	public static void solveExercise330() {
		System.out.println("Positive integer is perfect if it is " 
				+ "equal to the sum of all it's dividers, exept itself:");
		System.out.println("Enter the number to find all " + 
				"perfect numbers that are less than it");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Perfect numbers: " 
		+ findAllPerfectNumbersTask330(sc.nextInt()));
	}
}
