package com.Lockedme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatesOption {
	static Scanner scanner = new Scanner(System.in);
	final static String filepath = "Resources\\";
	
	public static void Create() {
	 
	boolean success = false; 
	System.out.println("Enter User Directory to create"); 
	String dir =filepath+ scanner.nextLine(); // Creating new directory in Java, if it doesn't exists 
	try 
	{
	File directory = new File(dir); 
	if (directory.exists())
		{ System.out.println("User Directory already exists ..."); 
		} 
	else 
	{ 
		System.out.println("User Directory not exists, creating now"); 
		success = directory.mkdir(); 
		if (success) 
		{ 
			System.out.printf("Successfully created new directory : %s%n", dir); 
		}
		else
		{ 
			System.out.printf("Failed to create new directory: %s%n", dir);
		}
		}
	// Creating new file in Java, only if not exists 
	System.out.println("Enter file name to be created "); 
	String filename = directory+"\\" +scanner.nextLine();//Saves file in the created user Directory
	File f = new File(filename);
	
	if (f.exists()) 
	{ 
		System.out.println("File already exists");
		System.out.println("Do you want add any content to the File??(y or n)");
		String ch =scanner.next().toLowerCase();
		if (ch.equals("y")) {
			System.out.println("Enter your content as Input");
			//write(f); //if file exist, we can overwrite the content of the file
			String content = scanner.next();
			
				FileWriter fw = new FileWriter(filepath+ "\\"+f);
				fw.write(content);
				fw.close();
	            System.out.println("Successfully written");

					}
		
			else if (ch.equals("n")){
				System.out.println("Thanks for using Appliation");
				System.exit(0);
			}
	}
	else  { 
		System.out.println("No such file exists, creating now"); 
		success = f.createNewFile(); 
			if (success) 
			{
				System.out.printf("Successfully created new file: %s%n ",f ); 
				System.out.println(" Do you want to add content to the file?(Yes/No)");
				String ch = scanner.next().toLowerCase();
				if(ch.equals("y") ) {
					System.out.println("Enter your content as Input");
					//write(f);
					String content = scanner.next();
					try {
						FileWriter fw = new FileWriter(filepath+ "\\"+f);
						fw.write(content);
						fw.close();
			  
			            System.out.println("Successfully written");

					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
				else if (ch.equals("n"))	{
					System.out.println("Thanks for using Appliation");
					System.exit(0);
				}
			}
			else 
			{
				System.out.printf("Failed to create new file: %s%n", f); 
				}
			} 
	}
	catch (IOException e) {
		e.printStackTrace();
		
	}
	
	}

	
}


