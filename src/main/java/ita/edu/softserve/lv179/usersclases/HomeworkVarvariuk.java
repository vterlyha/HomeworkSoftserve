package ita.edu.softserve.lv179.usersclases;

import java.util.Scanner;

public class HomeworkVarvariuk {

	public static void solveExercise86a() {
		System.out.println("Write down positive integer; how many digits does it contain?:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		Integer counter = 0;
		while ((number % 10) != 0) {
			number = number / 10;
			counter++;
		}
		System.out.println("The counter is: " + counter);
	}

	public static void solveExercise86b() {
		System.out.println("Write down positive integer; What is the sum of it's digits?:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		Integer sum = number % 10;
		while ((number % 10) != 0) {
			number = number / 10;
			sum += number % 10;
		}
		System.out.println("The sum is: " + sum);
	}

	public static void solveExercise330() {
		System.out.println("Positive integer is perfect if it is equal to the sum of all it's dividers, exept itself:");
		System.out.println("Enter the number to find all perfect numbers that are less than it");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String output = "Perfect sums: ";
		int perfectSum = 0;
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < i; j++) {
				if ((i % j) == 0) {
					perfectSum += j;
				}
			}
			if (perfectSum == i) {
				output += i + ",";
			}
			perfectSum = 0;
		}
		System.out.println(output);
		;
	}
}
