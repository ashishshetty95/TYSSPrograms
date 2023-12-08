package String;

import org.testng.annotations.Test;

public class PrintMaximumLengthWordsInGivenArrayTest {
	@Test
	public void max() {
		String s[]= {"fd", "asdf", "gdhf", "sgh","sg","dg"};
		String max=s[0];
		for(int i=0;i<s.length;i++) {
			if (s[i].length()>max.length()) {
				max=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if (s[i].length()==max.length()) {
				System.out.println(s[i]);
			}
		}
	}
}
