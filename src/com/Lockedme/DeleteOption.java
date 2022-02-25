package com.Lockedme;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class DeleteOption {
	
	public static void DeleteFile() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Filename");
		String filename = scanner.next();
		String filepath = "Resources\\"+ filename;
		System.out.println("Please confirm the file to be deleted\n (Yes to confirm) (No to Cancel)");
		String choice = scanner.next().toLowerCase();
		if(choice == "yes") {
			Path path =  Paths.get(filepath);
			
			 try {
				Files.deleteIfExists(path);
				System.out.println("File Deleted Succesfully");
			 }
			 
				
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
			else if (choice.equals("no")
					{
				
			}
			 
				scanner.close();
			
		}


	
	}


		