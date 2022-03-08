package deliverableOne;

import java.util.Scanner;

public class PasswordValidator {
		
	static String userPassword;
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// asks user to create password with criteria as listed
		
		System.out.println(" Welcome to the password validator. Please create a password with the following requirements:\n" +
		"  - At least one lowercase letter. \n" +
		"  - At least one uppercase letter. \n" +
		"  - At least minimum 7 characters. \n" +
		"  - At least maximum 12 characters. \n" +
		"  - An exclamation point (!)");
		userPassword = scnr.nextLine();	
		
		// output message if all true, loop to re-input if false
		
		
		
		
	}

}
