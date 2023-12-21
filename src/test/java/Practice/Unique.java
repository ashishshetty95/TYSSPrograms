package Practice;

import org.testng.annotations.Test;

public class Unique {
	@Test
	public void lookAndSay() {
		String n="1";
		String res=""+n;
		for(int i=0;i<=10;i++) {
			int count=1;
			for(int j=0;j<res.length()-1;j++) {
				
				if(res.charAt(j)==res.charAt(j+1)) {
					count++;
				}else {
					res=count+""+res;
					
					count=1;
				}
			}
			n=res;
			System.out.print(",");
		}
	}
}
