package String;

import org.testng.annotations.Test;

public class SumOfDigitsInAString {
	@Test
	public void sum() {
		String s="a2b4c6";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				System.out.println(s.charAt(i));
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println("Sum of digits in given string: "+sum);
	}
}
