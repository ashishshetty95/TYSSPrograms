package String;

import org.testng.annotations.Test;

public class OccurenceOfCharactedUnique {
	@Test
	public void unique() {
		String s="malayalam";
		char[] ch = s.toLowerCase().toCharArray();
		boolean[] flag=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if (flag[i]==false) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if (ch[i]==ch[j]) {
						count++;
						flag[j]=true;
					}
				}
				if (count==1) {
					System.out.println(ch[i]+" is a unique character");
				}
			}
			
		}
	}
}
