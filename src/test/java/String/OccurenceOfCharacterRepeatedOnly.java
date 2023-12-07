package String;

import org.testng.annotations.Test;

public class OccurenceOfCharacterRepeatedOnly {
	@Test
	public void repeated() {
		String s="cucumber";
		char[] ch = s.toLowerCase().toCharArray();
		boolean[] flag=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if (flag[i]==false) {
				for(int j=i+1;j<ch.length;j++) {
					if (ch[i]==ch[j]) {
						count++;
						flag[j]=true;
					}
				}
			}
			if (count>1) {
				System.out.println(ch[i]+" is a repeated character");
			}
		}
	}
}
