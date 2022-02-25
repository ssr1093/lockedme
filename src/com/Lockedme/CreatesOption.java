package com.Lockedme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreatesOption{
	final static String filepath = "Resources\\";
	static Scanner scanner = new Scanner(System.in);

	public static LockedMenu Create() {
		System.out.println("Do You want to Create User Folder? (Y/N)");
		String ch = scanner.next().toLowerCase();
		
		//scanner.nextLine();
		if (ch.equals( "y")) { 
			System.out.println("Enter desired Folder name to Create Fodler");
			CreateFolder();
			
					}
		else if ( ch.equals("n")) { 
			CreatesOption createfile = new CreatesOption();
			createfile.Createfile();
		
		}
	return null;// returns to main menu
	}
	public static void CreateFolder() {
		{
			//String FolderName = scanner.nextLine();
			File file = new File(filepath);

			// If file doesn't exist, creates in the Resource folder
			if (!file.exists()) {
				Boolean bool = file.mkdirs();
				if(bool)
				System.out.println("Folder Created Succesfully");
				else {
					System.out.println("Error Found");
				}
			CreatesOption createfile = new CreatesOption();
			createfile.Createfile();
			}
			
		}

	}
	public void Createfile() {
		System.out.println("Enter Filename to Create");
		String fileToAdd = scanner .next();
		Path pathToFile = Paths.get(filepath + fileToAdd+"\\");
		try {
			
			Files.createDirectories(pathToFile.getParent());
		 	Files.createFile(pathToFile);
			System.out.println(fileToAdd + " created successfully");
			System.out.println("Do You Want to Add Content to the File?(Y/N)");
			String ch = scanner.next().toLowerCase();
			if (ch.equals("y")) {
				Writes(fileToAdd);
			}
		}
		catch (IOException e) {
			
			e.printStackTrace();
		
			
		}
			
		}
	
	public static void Writes(String Filename) throws IOException {
		System.out.println("\nInput content and press enter\n");
		String content = scanner.nextLine();
		FileWriter writer = new FileWriter(filepath);  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write(content);  
	    buffer.close();  
	    System.out.println("Success"); 
		
			}

	 

}
