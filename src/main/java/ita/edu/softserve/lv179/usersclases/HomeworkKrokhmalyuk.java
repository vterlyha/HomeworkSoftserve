package ita.edu.softserve.lv179.usersclases;

import java.util.Scanner;

public class HomeworkKrokhmalyuk {
		
	private HomeworkKrokhmalyuk() {		
	}
	
/*Calculate numbers which subject condition */
	public static void function178G() {
		System.out.println("Enter array length : ");
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int array [] = generateArray(arrayLength);
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				i = array[0];
				if (array[i] < ((array[i - 1] + array[i + 1]) / 2)) {
					System.out.println(array[i]);
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
	/*Calculate numbers which subject condition */
	public static void function178D() {
		System.out.println("Enter array length : ");
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int [] array = generateArray(arrayLength);
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] > Math.pow(2, i)) && (array[i] < factorial(i))) {
				System.out.println(i);
				counter++;
			}
		}
		System.out.println(counter);
	}
/* Show Pascal Triagle */
	public static void function555(){
		System.out.println("Enter triagle height :");
		Scanner scanner = new Scanner(System.in);
		int triagleHeight = scanner.nextInt();
		for (int i = 0; i < triagleHeight; i++) {
            int number  = 1;
            System.out.format("%"+(triagleHeight - i)*2+"s","");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number=number * (i - j) / (j + 1); 
            }
            System.out.println("");
        }
	}
	
	private static int [] generateArray(int arraylength){
		int array [] = new int [arraylength];
		for(int i = 0; i<arraylength;i++){
		array [i] = i;
		}
		return array;
	}

	private static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);
	}
	
	public static HomeworkKrokhmalyuk getInstance(){
		return new HomeworkKrokhmalyuk();
	}
}
