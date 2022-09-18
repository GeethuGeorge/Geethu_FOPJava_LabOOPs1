package com.lab1.oops;


import java.util.Random;

//created 3 methods 


public class CredentialService {
	 String email;
	 String password;
	 
	 //Method 1 with no return type
public void generateEmailAddress(Employee emp, String dept){
   email = emp.getFirstName()+ emp.getLastName() +"@"+ dept+".abc.com";
			};
			
	//Method 2	with char[] return type
public char[] generatePassword(int length){
	  String capitalCaseLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	  String specialCharacters = "!@#$";
	  String numbers = "1234567890";
	  String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	  Random random = new Random();
	  char[] password = new char[length];
	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }	     
	   
	  return password;
	   
  };
	
		//Method 3 with no return type
	 public void showCredentials(char[] passw) {
		
		 System.out.println("Email -->"+ email);
	     System.out.println("Password -->"+ String.valueOf(passw) );
	 };

	
}
