package com.Lockedme;

import java.util.Scanner;

public class LockedMenu {
public static void main (String[] args) {
	
		Scanner obj = new Scanner(System.in);
		int choice;
	do {
		
		Display("LockedMe", "Sudhakar");
		choice =Integer.parseInt(obj.nextLine());
		switch (choice) {
		
		case 1:
			RetrieveAllFiles.DisplayAllFiles();
			break;
		case 2:
			Secondmenu();
			break;
		case 0:
			System.exit(0);
			obj.close();
			System.out.println("Thanks for using the Application");
			break;
		default:
			System.out.println("Please Enter Valid Option");
		}
		
	}
while (choice != 3);
	
	
}

private static void Secondmenu() {
	System.out.println(" 3.Create File \n 4.Delete File \n 5.Search File \n"
			+ " 6.Main Menu \n 0.Exit");
	Scanner obj = new Scanner(System.in);
	int ch = Integer.parseInt(obj.nextLine());
	do {
					
	switch (ch) {
	case 3:
		CreatesOption.Create();
		break;
	case 4:
		DeleteOption.DeleteFile();
		System.out.println("Delete File");
		break;
	case 5:
		SearchOption.SearchFile();
		break;
	case 6:
//		go to menu
		System.out.println("to MainMenu");
		return;
	case 0:
		System.exit(0);
		System.out.println("Thanks for using the Application");
		obj.close();
		break;
	default:
		System.out.println("Please Enter Valid Input");
	}
	}
	while (ch != 0);
	

	
}

private static void Display(String appName, String developerName) {
	System.out.println("*******************************************************");
	System.out.printf("\tWELCOME TO %S \n\tDEVELOPED by %s",appName,developerName);
	System.out.println("\n****************************************************");
	System.out.println(" 1.Retrieve All Files\n 2.Operations\n 0.Exit");

}
}
