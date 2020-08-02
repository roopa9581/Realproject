package com.realproject;
import java.util.Scanner;

public class LoginPage implements IRegistrationPage {
	public static void main(String[] args) {
		String user_name=userPass.user_name;
		
		String password =userPass.password;
		   System.out.println("\n");
		   System.out.println("****************************************************************");
		   System.out.println("------------------       Login Page          -------------------");
		   System.out.println("****************************************************************");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter User name");
			 String input=scan.nextLine();
			 System.out.println("Enter Password\n");
			 String pwd=scan.nextLine();
			 if(input.equals(user_name)&&pwd.equals(password)) {
				 System.out.println("Log in successfull");
				 MenuFiles.main(null);
				 
			 }
			 else {
				 System.out.println("Invalid username or password....Please Try again.!!");
				 LoginPage.main(null);;
			 }
			
			 
			 
	
	}
}
	
	


