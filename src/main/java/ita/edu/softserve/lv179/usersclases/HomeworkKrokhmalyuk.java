package ita.edu.softserve.lv179.usersclases;

import java.util.Scanner;

public class HomeworkKrokhmalyuk {
	static Scanner scanner = new Scanner(System.in);

	public HomeworkKrokhmalyuk() {
	}
	
	static public class SupportPrint{		
				
		public static void printMethodInfoForExersise178D(){
			System.out.println("Enter array length : ");
			int arrayLength = scanner.nextInt();
			System.out.println(function178D(arrayLength));
		}	
		public static void printMethodInfoForExersise178G(){
			System.out.println("Enter array length : ");
			int arrayLength = scanner.nextInt();
			System.out.println(function178G(arrayLength));
		}
	}
	
	/**
	 * Calculate numbers which subject condition
	 */
	public static String function178G(int arrayLength) {
		int array[] = generateArray(arrayLength);
		String  counter = "";
		for (int i = 0; i < array.length; i++) {
			if(i == array.length){ array[i] = array[array.length-1]; break;}
				if (array[i] > ((array[i] + array[i++]) / 6)) {
					counter += array[i];					
				}		
		}
		return counter;
	}

	/**
	 * Calculate numbers which subject condition
	 */
	public static String function178D(int arrayLength) {
		int[] array = generateArray(arrayLength);
		String counter = "";
		for (int i = 0; i < array.length; i++) {
			if ((array[i] < Math.pow(2, i)) && (array[i] < factorial(i))) {
				counter += array[i];
			}
		}
		return counter;
	}

	/** 
	 * Show Pascal Triangle 
	 */
	public static void function555() {
		System.out.println("Enter triagle height :");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int triagleHeight = scanner.nextInt();
		for (int i = 0; i < triagleHeight; i++) {
			int number = 1;
			System.out.format("%" + (triagleHeight - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println("");
		}
	}

	public static int[] generateArray(int arraylength) {
		int array[] = new int[arraylength];
		for (int i = 1; i < arraylength; i++) {
			array[i] = i;
		}
		return array;
	}
	
	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);
	}
	
	public static HomeworkKrokhmalyuk getInstance() {
		return new HomeworkKrokhmalyuk();
	}
}
