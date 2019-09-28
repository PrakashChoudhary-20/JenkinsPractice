import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void validPalindrome()
	{
		assertTrue((new Palindrome()).checkPalindrome(404));
	}
	
	@Test
	public void invalidPalindrome() 
	{
		assertFalse((new Palindrome()).checkPalindrome(1231));
	}
}
