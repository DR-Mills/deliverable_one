package deliverableOne;

public class Validation {
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

//	String password;
	
//	public Validation(String pw) { password = pw; }
	 

	//Password Validator boolean return
	public static boolean isPasswordValid(String pw) {
		if (hasLowercase(pw) == true) {
			if (hasUppercase(pw) == true) {
				if (has7CharMin(pw) == true) {
					if (doesNotExceed12CharMax(pw) == true) {
						if (hasExclamation(pw) == true) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	
	//Boolean Logic Password Requirements Checks
	//lowercase check
	public static boolean hasLowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				return true;
		    }
		}
		return false;
	}
	
	//uppercase check
	public static boolean hasUppercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	//minimum 7 character check
	public static boolean has7CharMin(String str) {
		if (str.length() >= 7) {
			return true;
		}
		return false;
	}
	
	//maximum 12 character check
	public static boolean doesNotExceed12CharMax(String str) {
		if (str.length() <= 12) {
			return true;
		}
		return false;
	}
	
	//contains exclamation point (!) check
	public static boolean hasExclamation(String str) {
		if (str.contains("!")) {
			return true;
		}
		return false;
	}


}
