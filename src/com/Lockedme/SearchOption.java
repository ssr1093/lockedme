package com.Lockedme;

import java.io.File;
import java.util.Scanner;

public class SearchOption {

	public static LockedMenu SearchFile() {
		final String filepath = "Resources\\";
		Scanner scanner = new Scanner(System.in);
		File folder= new File(filepath);
		if(folder.isDirectory() == true) {
		String[] files = folder.list();
		int flag = 0;
        if (files == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < files.length; i++) {
                String filename =scanner.next( );
                filename = files[i];
                filename.
                if (filename.equalsIgnoreCase(filename)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }
        scanner.close();
		}
	return null ;
	}

}
