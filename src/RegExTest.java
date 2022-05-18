import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
	
	@Test
	public void testUpperCase() {
		String upper = "UPPER";
		assertTrue(Pattern.compile(upper).matcher(upper).matches());
	}
	
	@Test
	public void testDigit() {
		String oneDigitChar = "Test1!";
		assertTrue(Pattern.compile(oneDigitChar).matcher(oneDigitChar).matches());
	}
	
	@Test
	public void testPhoneNumber() {
		String phoneNumber = "313-333-3333";
		assertTrue(Pattern.compile(phoneNumber).matcher(phoneNumber).matches());
	}
	
	@Test
	public void testDate() {
		String date = "05/17/2022";
		assertTrue(Pattern.compile(date).matcher(date).matches());
	}

}
