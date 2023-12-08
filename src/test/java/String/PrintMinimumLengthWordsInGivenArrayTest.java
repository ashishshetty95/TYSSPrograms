package String;

import org.testng.annotations.Test;

public class PrintMinimumLengthWordsInGivenArrayTest {
	@Test
	public void min() {
		String s[]= {"as", "gfd", "fd", "sdfg", "dfsr"};
		String min=s[0];
		for(int i=0;i<s.length;i++) {
			if (s[i].length()<min.length()) {
				min=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if (s[i].length()==min.length()) {
				System.out.println(s[i]);
			}
		}
	}
}
