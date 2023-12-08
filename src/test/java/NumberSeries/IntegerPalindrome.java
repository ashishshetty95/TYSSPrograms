package NumberSeries;

import org.testng.annotations.Test;

public class IntegerPalindrome {
	@Test
	public void palindrome() {
		int a=123656321;
		int temp=a;
		int rev=0;
		while (a>0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if (temp==rev) {
			System.out.println("Given number is a palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
	}
}
