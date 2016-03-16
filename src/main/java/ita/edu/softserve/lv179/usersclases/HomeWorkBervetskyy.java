package ita.edu.softserve.lv179.usersclases;


import java.util.Scanner;

public class HomeWorkBervetskyy{
  /**
   * @param DEVIDER is used for divide our number
   */
  private static final int DEVIDER = 10;
  /**
   * @param  REMAINDER is used for finding remainder of division
   */
  private static final int REMAINDER = 10;
  /**
   * @param NUMBER_CONTAIN is used for finding this digital in entered number
   */
  private static final int NUMBER_CONTAIN = 3;
  /**
   * @param MIN it's a min number for finding number with  the biggest amount of divider
   */
  private static final int MIN = 0;
  /**
   * @param MIN it's a max number for finding number with  the biggest amount of divider
   */
  private static final int MAX = 10000;

  private HomeWorkBervetskyy(){
            /* NOP */
  }
	public static int initNumber(){
  	  Scanner scanner = new Scanner(System.in);
  	  System.out.println("Введіть число:");
  	  int number = scanner.nextInt();
  	  return number;
  	}
  	
  	public static int squereNumber(int n){
 	    if(n == 0){
 		return 0;
 	    }
  	    if (n < 0){
 		throw new IllegalArgumentException();
  	    }
  	    return n*n;
  	}
  	
  	public static void answer(boolean bool, int number){
 	    System.out.println("ВІДПОВІДЬ:");
		if (bool) {
			System.out.println("Квадрат числа = " + number * number + " і вoно містить цифру 3" + "\n");
		}else{
			System.out.println("Квадрат числа = " + number * number + " і воно не містить цифру 3" + "\n");
		}
  	}
  	
  	public static boolean isFoundNumber(int number){
  	    if(number < 0){
  		throw new IllegalArgumentException();
  	    }
  	    if(number == 0){
  		return false;
  	    }
 	    boolean result = false;
		while (number != 0) {
			int temp = number % REMAINDER;
			if (temp == NUMBER_CONTAIN) {
				result = true;
			}
			number /= DEVIDER;
		}
		return result;
  	}
  	
  	/**
	 * Solving exercise number 88a  
	 */
  	
	public static void solveExercise88a() {
		int number = initNumber();
		int squereN = squereNumber(number);
		boolean isConsist = isFoundNumber(squereN); 
		answer(isConsist, number);
	}
	
	public static int changeOrder(int n){
	    if(n < 0){
		throw new IllegalArgumentException();
	    }
	    if(n == 0){
		return 0;
	    }
	    int result = 0;
	    while (n != 0) {
		result *= DEVIDER;
		result += n % REMAINDER;
		n /= DEVIDER;
	    }
	    return result;
	}
	
	/**
	 * Solving exercise number 88b  
	 */
	
	public static void solveExercise88b() {
		int number = initNumber();
		int result = changeOrder(number);
		answer2(result);
	}
	
	private static void answer2(int result){
	    System.out.println("ВІДПОВІДЬ:");
		System.out.println("Число з оберненим порядком: " + result + "\n");
	}
	/**
   * Solving exercise number 322  
   */
	public static void solveExercise322(){
		int number = 0;
		int max = 0;
		for(int i = MIN; i < MAX; i++){
			int temp = i;
			int tempMax = 0;
			for(int j = 1; j <= temp; j++){
				if(temp % j == 0){
					tempMax += j;
				}
			}
			if(tempMax > max){
				max = tempMax;
				number = temp;
			}
		}
		answer3(number, max);
	}
	
	public static void answer3(int number, int max){
	    System.out.println("ВІДПОВІДЬ:");
		System.out.println("Число " + number + " має набільшу суму дільників у проміжку від 1 до 10000 і становить " + max + "\n");

	}
}
	
