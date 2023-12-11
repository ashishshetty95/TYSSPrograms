package String;

import org.testng.annotations.Test;

public class aabbabc {
	@Test
	public void demo() {
		String s="aabbabc"; 	//o/p: a2b2a1b1c1
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				count++;
			} else {
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);
		System.out.println();
	}
}
