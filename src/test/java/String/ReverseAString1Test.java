package String;

import org.testng.annotations.Test;

public class ReverseAString1Test {
	@Test
	public void reverse() {
		String s="Ashish";
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
}
