package String;

import org.testng.annotations.Test;

public class RepeatedWordsInASentenceTest {
	@Test
	public void repeat() {
		String s="hi hello hi hello welcome".toLowerCase();
		String[] sp=s.split(" ");
		boolean[] flag=new boolean[sp.length];
		for(int i=0;i<sp.length;i++) {
			if (flag[i]==false) {
				int count=0;
				for(int j=i+1;j<sp.length;j++) {
					if (sp[i].equalsIgnoreCase(sp[j])) {
						count++;
						flag[j]=true;
					}
				}
				if (count>0) {
					System.out.println(sp[i]+" is a repeated word");
				}
			}
		}
	}
}
