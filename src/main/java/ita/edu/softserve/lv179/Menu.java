package ita.edu.softserve.lv179;

import java.util.Scanner;

import ita.edu.softserve.lv179.usersclases.HomeworkKrokhmalyuk;

public class Menu {
	
	private final String [] menuPoints = {
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"7 - exersise 178.g",
			"8 - exersise 178.d",
			"9 - exersise 555",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
	};
	
	private void display(){
		for(int i = 0; i<menuPoints.length; i++){
			System.out.println(menuPoints[i]+"\t||"+menuPoints[++i]);
			System.out.println("-------------------------------------------------------");
	}
}
	public void caseMenuItem(){
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		String menuItem = null;
		while(status){
			display();
			menuItem = scanner.nextLine();			
			switch(menuItem){
			case  "0" :
				System.out.println("Good bye !");
				status = false;
				break;
			case "6" :
				HomeworkKrokhmalyuk.function178D();
				break;
			case "7":
				HomeworkKrokhmalyuk.function178G();
				break;
			case "9":
				HomeworkKrokhmalyuk.function555();
				break;
				default:
					System.out.println("\nYou enter invaild symbol\n");
					
			
			}
			
		}
	}
	
}
