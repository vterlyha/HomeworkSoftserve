package ita.edu.softserve.lv179;

import java.util.Scanner;

import ita.edu.softserve.lv179.usersclases.*;

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
            "9 - exersise 555", "10 - exersise 87", "11 - exersise 323", "12 - exersise 559", "13 - exersise 81a",
            "14 - exersise 81b", "15 - exersise 330", "16 - exersise 88a", "17 - exersise 88b", "18 - exersise 322",
            "19 - exersise 107", "20 - exersise 243a", "21 - exersise 243b", "0 - for Exit " };

    private void display() {
        for (int i = 0; i < menuPoints.length; i++) {
            if (i != menuPoints.length - 1) {
                System.out.println(menuPoints[i] + "\t||\t" + menuPoints[++i]);
                System.out.println("-------------------------------------------------------");
            } else {
                System.out.println(menuPoints[i]);
                break;
            }
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
                HomeWorkPetryk.solveExercise182(HomeWorkPetryk.returnNaturalNumber());
                System.out.println("-------------------------------------------------------");
                break;
            case "2":
                HomeWorkPetryk.printResult(HomeWorkPetryk.solveExercise323(HomeWorkPetryk.returnNaturalNumber()));
                System.out.println("-------------------------------------------------------");
                break;
            case "3":
                HomeWorkPetryk.printResult(HomeWorkPetryk.solveExercise560());
                System.out.println("-------------------------------------------------------");
                break;
            case "4":
                HomeworkTerlyha.solveExcercise108();
                System.out.println("-------------------------------------------------------");
                break;
            case "5":
                HomeworkTerlyha.solveExcercise325();
                System.out.println("-------------------------------------------------------");
                break;
            case "6":
                HomeworkTerlyha.solveExcercise561();
                System.out.println("-------------------------------------------------------");
                break;
            case "7":
                HomeworkKrokhmalyuk.SupportPrint printForFunc178G = new HomeworkKrokhmalyuk.SupportPrint();
                printForFunc178G.printMethodInfoForExersise178G();
                System.out.println("-------------------------------------------------------");
                break;
            case "8":
                HomeworkKrokhmalyuk.SupportPrint printForFunc178D = new HomeworkKrokhmalyuk.SupportPrint();
                printForFunc178D.printMethodInfoForExersise178D();
                System.out.println("-------------------------------------------------------");
                break;
            case "9":
                HomeworkKrokhmalyuk.function555();
                System.out.println("-------------------------------------------------------");
                break;
            case "10":
                HomeWorkBondar.showTask87();
                System.out.println("-------------------------------------------------------");
                break;
            case "11":
                HomeWorkBondar.showTask323();
                System.out.println("-------------------------------------------------------");
                break;
            case "12":
                HomeWorkBondar.showTask559();
                System.out.println("-------------------------------------------------------");
                break;
            case "13":
                HomeworkVarvariuk.solveExercise86a();
                System.out.println("-------------------------------------------------------");
                break;
            case "14":
                HomeworkVarvariuk.solveExercise86b();
                System.out.println("-------------------------------------------------------");
                break;
            case "15":
                HomeworkVarvariuk.solveExercise330();
                System.out.println("-------------------------------------------------------");
                break;
            case "16":
                HomeWorkBervetskyy.solveExercise88a();
                System.out.println("-------------------------------------------------------");
                break;
            case "17":
                HomeWorkBervetskyy.solveExercise88b();
                System.out.println("-------------------------------------------------------");
                break;
            case "18":
                HomeWorkBervetskyy.solveExercise322();
                System.out.println("-------------------------------------------------------");
                break;
            case "19":
                HomeworkKobevka.solveExercise107(13);
                System.out.println("-------------------------------------------------------");
                break;
            case "20":
                HomeworkKobevka.solveExercise243a(13);
                System.out.println("-------------------------------------------------------");
                break;
            case "21":
                HomeworkKobevka.solveExercise243b(13);
                System.out.println("-------------------------------------------------------");
                break;
            default:
                System.out.println("\nYou entered invalid symbol\n");
                System.out.println("-------------------------------------------------------");

            }

        }
    }

}
