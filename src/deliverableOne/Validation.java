package deliverableOne;

/*
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
 * Contains String validation (user submitted password) logic blocks.
 * 
 * @author Dustin Mills
 *
 */
public class Validation {
	
	/**
	 * Accepts a string and validates it against all password-specific deliverable requirements
	 * 
	 * @param pw a password String entered by the user
	 * @return true if requirements are met, otherwise a false
	 */
	public static boolean isValidPassword(String pw) {
		if (pw.length() >= 7) {
			if (pw.length() <= 12) {
				if (pw.contains("!")) {
					if (hasLowercase(pw) && hasUppercase(pw)) {
			return true;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Accepts a string and validates it against deliverable point 1.3, contains lowercase.
	 * 
	 * @param str a password String entered by the user.
	 * @return true if String contains a lowercase character.
	 */
	public static boolean hasLowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				return true;
		    }
		}
		return false;
	}

	/**
	 * Accepts a string and validates it against deliverable point 1.4, contains uppercase.
	 * 
	 * @param str a password String entered by the user.
	 * @return true if String contains an UPPERCASE character.
	 */
	public static boolean hasUppercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}
