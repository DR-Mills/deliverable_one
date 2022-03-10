package deliverableOne;

import java.util.Scanner;

/**
 * Welcome message and user interaction
 * 
 * @author Dustin Mills
 */
public class PasswordApp {

	private static Scanner scnr = new Scanner(System.in);

	/**
	 * Main entry point for the launcher.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		String userPassword = "";

		System.out.println(
				" Welcome to the password validator. Please create a password with the following requirements:\n"
						+ "  - At least one lowercase letter. \n" 
						+ "  - At least one UPPERCASE letter. \n"
						+ "  - At minimum 7 characters. \n" 
						+ "  - At maximum 12 characters. \n"
						+ "  - Contains an exclamation point (!).");
		userPassword = scnr.nextLine();

		if (Validation.isValidPassword(userPassword)) {
			System.out.println("Password valid and accepted");
		} else {
			System.out.println("Error");
		}

		scnr.close();
	}
}
