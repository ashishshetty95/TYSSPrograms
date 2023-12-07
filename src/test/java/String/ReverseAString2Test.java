package String;

import org.testng.annotations.Test;

public class ReverseAString2Test {
	@Test
	public void reverse() {
		String s="MALAYALAM";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-(i+1)];
			ch[ch.length-(i+1)]=temp;
		}
		String rev="";
		for(int i=0;i<ch.length;i++) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
}
