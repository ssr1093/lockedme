package com.Lockedme;

import java.io.File;
import java.util.Scanner;

public class DeleteOption {
	
	public static LockedMenu DeleteFile() {
		final String filepath = "Resources\\";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter desired file name to Delete");
		String filename = scanner.next();
		try  
		{   
		System.out.println("Please Confirm to Delete(Enter Yes or No)!!");
		String choice = scanner.next().toLowerCase();
		
		do
		{
		if (choice.equals(("yes"))) {
			    
				File f= new File(filepath+filename);           //file to be delete  
				if(f.delete())                      //returns Boolean value  
				{  
				System.out.println(f.getName() + "Succesfully deleted");   //getting and printing the file name  
				}  
				else  
				{  
				System.out.println("failed");  
				}  
		}
		
		}  
		while(choice.equals("no")); {
				System.out.println("Application terminated");//need to use the return method to main class
			scanner.close();	
//			System.exit(0);
			
			}
		}
		
		catch(Exception e)  
		{  
		e.printStackTrace();  
		
		}
		return null;//returns to locked menu
		
			
		}


	
	}


		