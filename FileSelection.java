package com.realproject;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.io.IOException;
public class FileSelection {
public static void main(String[] args) {
	
	Scanner scan1=new Scanner(System.in);
	String s1=scan1.next();
	char choice1=s1.charAt(0);
	switch(choice1) {
	case'1':
		try { 
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter filename");
			String filename = scan.next();
			File file = new File("C:\\\\\\\\Users\\\\\\\\rmanganapall\\\\\\\\OneDrive - DXC Production\\\\\\\\Documents\\\\\\\\Roopa\\" + filename);
			boolean status;
			if (file.exists())
				System.out.println("File exists");
			else {
				status = file.createNewFile();
				System.out.println((status == true) ? "File Created.." : "File Not Created..");
			}
		}
	         catch(IOException ex) {
	        	 ex.printStackTrace();
	        
	         }
		 MenuFiles.main(null);
		 break;
		
		
	case '2':	
		
		try { 
	         Serializable file = new File("C:\\\\Users\\\\rmanganapall\\\\OneDrive - DXC Production\\\\Documents\\\\Roopa");
	         File[] filelist=((File) file).listFiles();
	         System.out.println("Enter The FileName To be Deleted Followed By .txt");
	         Scanner scan=new Scanner(System.in);
	         String filename=scan.next();
	         String abs_path="";
	         for (File file2 : filelist) {
				if(file2.getName().equals(filename)) {
					abs_path=file2.getAbsolutePath();
					file2.delete();
				}}
	         if(abs_path.isEmpty()) {
	        	 System.out.println("file Not Found");
	        	 
	         }
	         else {
	        	 System.out.println("file is deleted");
	        	 MenuFiles.main(null);
	        	 break;
	         }
				
	         
		 }
	         catch(Exception ex) {
	        	 ex.printStackTrace();
	        
	         }
		 
		 break;
	case '3':
		try{
			Serializable file = new File("C:\\\\Users\\\\rmanganapall\\\\OneDrive - DXC Production\\\\Documents\\\\Roopa");
		
		File[] filelist=((File) file).listFiles();
		System.out.println("enter the file Name followed by .txt");
		Scanner scan=new Scanner(System.in);
		String filename=scan.next();
		
		 String abs_path = " ";
    	 for (File file2 : filelist) {
    		
    		 if(file2.getName().equals(filename))
    	        {
    	            
    	            abs_path=file2.getAbsolutePath();
    	        }
    	 }
          if(abs_path.isEmpty())
        	  System.out.println("not found");
          else {
        	  System.out.println("found at" +abs_path);
        	  MenuFiles.main(null);
          break;
          }
	 }
    	 catch( Exception ex) {
    		 ex.printStackTrace();
    	}
	
	 break;
		
		
		
		
	case '4':
		ApplicationMenuPage.main(null);
		break;
	default :
		System.out.println("Select the correct option");
	}
	
	 
}
}
