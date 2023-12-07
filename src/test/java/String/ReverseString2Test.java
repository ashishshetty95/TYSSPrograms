package String;

import org.testng.annotations.Test;

public class ReverseString2Test {
	@Test
	public void reverse() {
		String s="i am software engineer";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String s2=s1[i];
			char[] ch2 = s2.toCharArray();
			String rev="";
			for(int j=ch2.length-1;j>=0;j--) {
				rev=rev+ch2[j];
			}
			System.out.print(rev+" ");
		}
	}
}
