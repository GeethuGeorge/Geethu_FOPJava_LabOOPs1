package com.lab1.oops;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please Enter your First Name");
		String fName=scan.nextLine();
		
		System.out.println("Please Enter your Last Name");
		String lName=scan.nextLine();
		
		Employee emp =new Employee(fName,lName);
		
		
		System.out.println("Please Enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		int key=scan.nextInt();
		
		//to access the methods in services
		
		CredentialService service=new CredentialService();
		
		char[] passw;
		
		switch(key) {
		
		case 1: 
		 service.generateEmailAddress(emp,"tech");
		 passw = service.generatePassword(8);
		 service.showCredentials(passw) ;
		 break;
		 
		case 2: 
			 service.generateEmailAddress(emp,"admin");
			 passw= service.generatePassword(8);
			 service.showCredentials(passw) ;
			 break;
		case 3: 
			 service.generateEmailAddress(emp,"hr");
			  passw=service.generatePassword(8);
			 service.showCredentials(passw) ;
			 break;
		case 4: 
			 service.generateEmailAddress(emp,"legal");
			  passw= service.generatePassword(8);
			 service.showCredentials(passw) ;
			 break;
			 
			 default:
		    System.out.println("Please enter the correct option");
		}
	
	scan.close();	

	}

}
