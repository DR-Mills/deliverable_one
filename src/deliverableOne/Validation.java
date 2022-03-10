package deliverableOne;


/**
 * Contains string validation logics.
 * 
 * @author Dustin Mills
 *
 */
public class Validation {
	/* Password Validation Requirements:
	 * 1) Print a message asking the user to input a password via the console (1 point) --Main()
	 * 2) Receive the input via the console (1 point) --Main()
	 * 3) Check if there is at least one lowercase letter (1 point)
	 * 4) Check if there is at least one uppercase letter (Hint: Google Java check if string contains lowercase/uppercase) (1 point)
	 * 5) Check if there are at least 7 characters (1 point)
	 * 6) Check if there are no more than 12 characters (1 point)
	 * 7) Check if there is a ! (1 point)
	 * 8) If the password is valid, print "Password valid and accepted" (2 points) --Main()
	 * 9) If the password isn’t valid, print "Error" (1 point) --Main()
	 */


	/**
	 * Accepts a string and validates against all password-specific deliverable requirements
	 * 
	 * @param pw a password entered by the user
	 * @return true if requirements are met, otherwise false
	 */
	public static boolean isValidPassword(String pw) { //fix me:  combine the code from line 73 to 99 into this method here
		return hasLowercase(pw) && hasUppercase(pw) && has7CharMin(pw) && doesNotExceed12CharMax(pw) && hasExclamation(pw);
	}

	/**
	 * Accepts a string and validates it against deliverable point 1.3, contains lower case.
	 * 
	 * @param str a password String entered by the user.
	 * @return true if String contains a lower case character, otherwise false.
	 */
	private static boolean hasLowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				return true;
		    }
		}
		return false;
	}


	/**
	 * Accepts a string and validates it against deliverable point 1.4, contains upper case.
	 * 
	 * @param str a password entered by the user.
	 * @return true if String contains an upper case character, otherwise false.
	 */
	private static boolean hasUppercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}


	/**
	 * Accepts a string and validates it against deliverable point 1.5, contains 
	 * at least 7 characters.
	 * 
	 * @param str a password entered by the user.
	 * @return true if String contains at least 7 characters, otherwise false.
	 */
	private static boolean has7CharMin(String str) { // delete me
		if (str.length() >= 7) {
			return true;
		}
		return false;
	}
	

	/**
	 * Accepts a string and validates it against deliverable point 1.6, contains
	 * at most 12 characters.
	 * 
	 * @param str a password entered by the user.
	 * @return true if String contains no more than 12 characters, otherwise false.
	 */
	private static boolean doesNotExceed12CharMax(String str) {  // delete me
		if (str.length() <= 12) {
			return true;
		}
		return false;
	}
	

	/**
	 * Accepts a string and validates it against deliverable point 1.7, contains
	 * an exclamation point.
	 * 
	 * @param str a password entered by the user.
	 * @return true if String contains an exclamation, otherwise false.
	 */
	private static boolean hasExclamation(String str) { // delete me
		if (str.contains("!")) { 
			return true;
		}
		return false;
	}

}
