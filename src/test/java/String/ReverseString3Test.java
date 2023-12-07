package String;

import org.testng.annotations.Test;

public class ReverseString3Test {
	@Test
	public void reverse() {
		String  s="i am software engineer";
		String[] s1 = s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
	}
}
