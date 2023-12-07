package String;

import org.testng.annotations.Test;

public class RemoveDuplicateStringTest {
	@Test
	public void duplicate() {
		String s="hi hello hi hello welcome";
		s=s.toLowerCase();
		String[] sp = s.split(" ");
		boolean[] flag=new boolean[sp.length];
		for(int i=0;i<sp.length;i++) {
			if (flag[i]==false) {
				for(int j=i+1;j<sp.length;j++) {
					if (sp[i].equalsIgnoreCase(sp[j])) {
							flag[j]=true;
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<flag.length;i++) {
			if (flag[i]==false) {
				count++;
			}
		}
		String[] str=new String[count];
		int n=0;
		for(int i=0;i<sp.length;i++) {
			if (flag[i]==false) {
				str[n]=sp[i];
				n++;
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
}
