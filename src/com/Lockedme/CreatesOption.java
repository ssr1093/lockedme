package com.Lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreatesOption{
	final static String filepath = "Resources";
	static Scanner scanner = new Scanner(System.in);

	public static void Create() {
		System.out.println("Do You want to Create User Folder? (Yes/No)");
		String ch = scanner.next().toLowerCase();
		
		//scanner.nextLine();
		if (ch.equals( "y || yes || ye")) { 
			CreateFolder();
			Createfile();
			
		}
		else if ( ! (ch.equals("n || no"))) { 
			Createfile();
		
		}
	
	}
	public static void CreateFolder() {
		{
			
			String FolderName = scanner.nextLine();
			File file = new File(filepath + FolderName);

			// If file doesn't exist, creates in the main folder
			if (!file.exists()) {
				file.mkdirs();
			}
		}

	}
	public static void Createfile() {
		
		String fileToAdd = scanner .next();
		Path pathToFile = Paths.get(filepath + fileToAdd);
		try {
			
			Files.createDirectories(pathToFile.getParent());
		 	Files.createFile(pathToFile);
			System.out.println(fileToAdd + " created successfully");
			System.out.println("Do You Want to Add Content to the File?(Y/N)");
			String ch = scanner.next().toLowerCase();
			if (ch.equals("y")) {
				Writes();
			}
		}
		catch (IOException e) {
			
			e.printStackTrace();
		
			scanner.close();
		}
			
		}
	
	public static void Writes() {
		System.out.println("\nInput content and press enter\n");
		Scanner sc = new Scanner(System.in);
		String content = sc .nextLine();
//		file writing has to be updated
//		Files.write(null, null, null);
		sc.close();
	}
}
