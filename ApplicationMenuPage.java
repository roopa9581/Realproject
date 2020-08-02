package com.realproject;
import java.util.Scanner;

public class ApplicationMenuPage {
public static void main(String[] args) {

	System.out.println("***************************************************************************************");
	System.out.println("-----------                  Welcome to Lockedme.com                     --------------");
	System.out.println("***************************************************************************************");
	System.out.println("-----------                       @MenuPage@                         ------------------");
	
	System.out.println("1.Register for Lockedme.com");
	System.out.println("2.Login for lockedme.com");
	System.out.println("enter your option");
	
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	char  choice =s.charAt(0);
	switch(choice) {
	case '1':
		IRegistrationPage.main(null);
		break;
	case '2':
		LoginPage.main(null);
		break;
	default :
		System.out.println("Enter Correct Options");
	}
	// TODO Auto-generated method stub
	
}

}
