import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		boolean upper =upperChar();
		System.out.println(upper);
		
		boolean oneDigit = oneDigitChar();
		System.out.println(oneDigit);

		boolean phoneNum = phoneNumber();
		System.out.println(phoneNum);
		
		boolean date = date();
		System.out.println(date);
	}



	private static boolean upperChar() {
		
		 boolean upper = Pattern.matches("^[A-Z]*$", "UPPER");
		
		return upper;
	}
	
	private static boolean oneDigitChar() {
		boolean oneDigitChar = Pattern.matches("^[a-zA-Z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$", "Test1!");
		return oneDigitChar;
	}
	
	private static boolean phoneNumber() {
		boolean phoneNumber = Pattern.matches("\\d{3}\\-\\d{3}\\-\\d{4}", "313-333-3333");
		return phoneNumber;
	}
	
	private static boolean date() {
		boolean date = Pattern.matches("\\d{2}\\/\\d{2}\\/\\d{4}", "03/10/2022");
		return date;
	}
}
