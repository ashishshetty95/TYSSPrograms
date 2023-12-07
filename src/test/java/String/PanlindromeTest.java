package String;

import org.testng.annotations.Test;

public class PanlindromeTest {
	@Test
	public void palindrome() {
		String s="sos";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if (rev.equalsIgnoreCase(s)) {
			System.out.println("Given string is a palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
	}
}
