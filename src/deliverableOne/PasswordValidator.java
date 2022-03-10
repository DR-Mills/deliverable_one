package deliverableOne;

import java.util.Scanner;


public class PasswordValidator {
    static Scanner scnr = new Scanner(System.in);
		
	static String userPassword; 
	
	public static void main(String[] args) {
		/*
		 * For testing purposes, if a loop is more convenient, please remove single-line comments
		 * within the main method below. To stay within the project scope, however, I have omitted
		 * the loop as part of the project. It's there only for convenience of testing my work.
		 */	

//		boolean pwdLoop = true;
//		while (pwdLoop) {
			System.out.println(
					" Welcome to the password validator. Please create a password with the following requirements:\n"
							+ "  - At least one lowercase letter. \n" + "  - At least one UPPERCASE letter. \n"
							+ "  - At minimum 7 characters. \n" + "  - At maximum 12 characters. \n"
							+ "  - Contains an exclamation point (!).");

			userPassword = scnr.nextLine();

			if (Validation.isValidPassword(userPassword)) {
				System.out.println("Password valid and accepted");
//				pwdLoop = false;
			} else {
				System.out.println("Error");
			}

//		}
		scnr.close();


		
	}
}

