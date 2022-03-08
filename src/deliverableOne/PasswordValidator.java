package deliverableOne;

import java.util.Scanner;

public class PasswordValidator {
		
	static String userPassword;
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// asks user to create password with criteria as listed & stores value as userPassword
				System.out.println(" Welcome to the password validator. Please create a password with the following requirements:\n" +
		"  - At least one lowercase letter. \n" +
		"  - At least one UPPERCASE letter. \n" +
		"  - At minimum 7 characters. \n" +
		"  - At maximum 12 characters. \n" +
		"  - Contains an exclamation point (!).");
		userPassword = scnr.nextLine();	
//		Validation validate = new Validation(userPassword);
		if (Validation.isPasswordValid(userPassword)) {
			System.out.println("Password valid and accepted");
		} else {
			System.out.println("Error");
			
		}
				
		scnr.close();
	}

	
			
		
		// * -- If the user meets all the requirements, print the string "Password valid and accepted" to the console
		// * -- If the password fails any of the requirements, print the string "Error".	
		
		
		
}

