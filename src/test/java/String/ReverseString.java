package String;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
	public void reverse() {
		String s="I am software engineer";
		String[] split = s.split(" ");
		
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
		
		
	}
}
