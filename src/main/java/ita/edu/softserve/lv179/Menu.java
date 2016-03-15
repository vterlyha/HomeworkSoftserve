package ita.edu.softserve.lv179;

import java.util.Scanner;
import ita.edu.softserve.lv179.usersclases.HomeworkTerlyha;
import ita.edu.softserve.lv179.usersclases.HomeworkKrokhmalyuk;
import ita.edu.softserve.lv179.usersclases.HomeWorkPetryk;

/**
 * Class Menu contains all needed data to perform App.
 * 
 * @author lv179jv
 * @version 1.0
 *
 */
public class Menu {

	private final String[] menuPoints = { "1 - exersise 182", "2 - exersise 323", "3 - exersise 560",
			"4 - exersise 108", "5 - exersise 325", "6 - exersise 561", "7 - exersise 178.g", "8 - exersise 178.d",
			"9 - exersise 555", "10 - exersise XXX", "11 - exersise XXX", "12 - exersise XXX", "13 - exersise XXX",
			"14 - exersise XXX", "15 - exersise XXX", "16 - exersise XXX", "17 - exersise XXX", "18 - exersise XXX",
			"19 - exersise XXX", "20 - exersise XXX", "21 - exersise XXX" };

	private void display() {
		for (int i = 0; i < menuPoints.length; i++) {
			System.out.println(menuPoints[i] + "\t||" + menuPoints[++i]);
			System.out.println("-------------------------------------------------------");
		}
	}

	/**
	 * Method used for perform operation - solving Exercise - which is chosen by
	 * User.
	 * 
	 * @param status
	 *            IS boolean parameter which is used for while-loop.
	 * @param menuItem
	 *            IS String parameter which is used in switch-condition as an
	 *            Operation chosen by User.
	 * @param scanner
	 *            IS resource parameter.
	 */
	public void caseMenuItem() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		String menuItem = null;
		while (status) {
			display();
			menuItem = scanner.nextLine();
			switch (menuItem) {
			case "0":
				System.out.println("Good bye !");
				status = false;
				break;
			case "1":
				HomeWorkPetryk.solveExercise182();
				break;
			case "2":
				HomeWorkPetryk.solveExercise323();
				break;
			case "3":
				HomeWorkPetryk.solveExercise560();
				break;
			case "4":
				HomeworkTerlyha.solveExcercise108();
				break;
			case "5":
				HomeworkTerlyha.solveExcercise325();
				break;
			case "6":
				HomeworkTerlyha.solveExcercise561();
				break;
			case "7":
				HomeworkKrokhmalyuk.function178D();
				break;
			case "8":
				HomeworkKrokhmalyuk.function178G();
				break;
			case "9":
				HomeworkKrokhmalyuk.function555();
				break;
			default:
				System.out.println("\nYou entered invalid symbol\n");

			}

		}
	}

}
