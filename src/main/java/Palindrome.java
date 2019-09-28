/**
 * 
 * @author Prakash
 * 
 * Program to check if a number is a palindrome.
 * Palindrome = 121 or 1001001 (reverse of a number is equal to the number itself.
 *
 */


public class Palindrome {
	public boolean checkPalindrome(int number) {
		int remainder, sum = 0, temp;

		temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = sum * 10 + remainder;
			number /= 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}
}
