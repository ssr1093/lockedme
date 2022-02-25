package com.Lockedme;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class RetrieveAllFiles {

	public static void DisplayAllFiles() {
//Display all files in the folder called Resources for this application
	final String filepath = "Resources\\";
	System.out.println("Displays all the files in Ascending order");
	 File file = new File(filepath);

	    // returns an array of all files
	    String[] fileList = file.list();

	    for(String str : fileList) {
	      System.out.println(str);
	    }
	System.out.println("Displaying all files with directory structure in ascending order\n");

	
	}

}
