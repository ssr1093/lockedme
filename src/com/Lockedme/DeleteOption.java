package com.Lockedme;

import java.io.File;
import java.util.Scanner;

public class DeleteOption {
	
	public static void DeleteFile() {
		final String filepath = "Resources\\";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter desired file name to Delete");
		String filename = scanner.next();
		try  
		{   
		System.out.println("Please Confirm to Delete(Enter Y(yes) or N(no)!!");
		String choice = scanner.next().toLowerCase();
		
		
		if (choice.equals(("y"))) {
			    
				File f= new File(filepath+"\\"+filename);           //file to be delete  
				if(f.delete())                      //returns Boolean value  
				{  
				System.out.println(f.getName() + " Succesfully deleted");   //getting and printing the file name  
				}  
				else  
				{  
				System.out.println("failed");  
				}  
		}
		
		
		else if(choice.equals("n")); {
				System.out.println("Application terminated");//need to use the return method to main class
			scanner.close();	
			System.exit(0);
			
			}
		}
		
		catch(Exception e)  
		{  
		e.printStackTrace();  
		
		}
		return;//returns to locked menu???
		
			
		}


	
	}


		