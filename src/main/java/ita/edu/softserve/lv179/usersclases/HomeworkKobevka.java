package ita.edu.softserve.lv179.usersclases;

//import java.io.*;
import java.util.*;

public class HomeworkKobevka {
    public static Map<Integer, Integer> answerValues = new HashMap<Integer, Integer>();
    //public int value = reader();

    /**
     * №107
     * Дано целое число m > 1. Получить наибольшее целое k,
     * при котором 4 в степени k < m
     */
    public static int solveExercise107(int value) {
        int m = value;
        int k = (int) (Math.log(m) / Math.log(4));
        System.out.println("№243a: n = " + (Math.pow(4, k) < m ? k : (k - 1)));
        return(Math.pow(4, k) < m ? k : (k - 1));
    }


    /**
     * №243a
     * Дано натуральное число n. Можно ли представить его
     * в виде суммы двух квадратов натуральных чисел? Если можно, то
     * а) указать пару x, y таких натуральных чисел, что n = x^2 + y^2;
     */
    public static boolean solveExercise243a(int value) {
        int n = value;
        boolean isTrue = pickUp(n);
        return isTrue;
    }

    private static boolean pickUp(int n){
        for (int x = 1; x < n; x++){
            for (int y = 1; y < n; y++){
                if (x*x + y*y == n) {
                    System.out.println("№243a: True, first match is " + x + "^2 + " + y + "^2 = " + n);
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * №243б
     * Дано натуральное число n. Можно ли представить его
     * в виде суммы двух квадратов натуральных чисел? Если можно, то
     * б) указать все пары x, y таких натуральных чисел, что n = x^2 + y^2, x >= y;
     */
    public static boolean solveExercise243b(int value) {
        int n = value;
        boolean isTrue = isTrue(n);
        if (!isTrue) System.out.println("No matches");
        return isTrue;
    }

    private static boolean isTrue(int n){
        boolean isTrue = false;
        for (int x = 1; x < n; x++){
            for (int y = 1; y <= x; y++){
                if (x*x + y*y == n) {
                    System.out.println("№243b: True, " + x + "^2 + " + y + "^2 = " + n);
                    answerValues.put(x,y);
                    isTrue = true;
                }
            }
        }
        return isTrue;
    }


   /* private static int reader(){
        int n = 0;
        System.out.println("Enter your value: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wrong number");
        }
        return n;
    }*/

}
