package String;

import org.testng.annotations.Test;

public class ReverseAString3Test {
	@Test
	public void test() {
		String s="ashish";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
	}
}
