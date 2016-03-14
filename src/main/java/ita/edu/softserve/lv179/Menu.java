package ita.edu.softserve.lv179;

import java.util.Scanner;

public class Menu {
	
	private final String [] menuPoints = {
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
			"X - exersise XX",
	};
	
	private void display(){
		for(String item : menuPoints){
			System.out.println(item);
			System.out.println("------------------");
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
			
			}
			
		}
	}
	
}
