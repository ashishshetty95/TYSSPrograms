package String;

import org.testng.annotations.Test;

public class ReverseAString4Test {
	@Test
	public void reverse() {
		String s="ashish";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
