package String;

import org.testng.annotations.Test;

public class PrintVowelsWithDuplicatesTest {
	@Test
	public void vowel() {
		String s="india";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if (ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
				if (b[i]==false) {
					int count=1;
					for(int j=i+1;j<ch.length;j++) {
						if (ch[i]==ch[j]) {
							count++;
							b[j]=true;
						}
					}
					System.out.println(ch[i]+" "+count);
				}
			}
		}
	}
}
