package String;

import org.testng.annotations.Test;

public class ILOVETYSS {
	@Test
	public void reverse() {
		String s="I LOVE TYSS"; //O/P:- S SYTE VOLI
		String s1=s.replaceAll(" ", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)!=' ') {
				System.out.print(s1.charAt(count--));
			}else {
				 System.out.print(s.charAt(i));
			}
		}
	}
}
