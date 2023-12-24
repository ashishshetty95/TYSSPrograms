package String;

import org.testng.annotations.Test;

public class PrintOnlyNumbersFromStringAndPrintInfromEndTest {
	@Test
	public void reverse() {
		String s="aabb1235dd456ee1ffh44".toLowerCase();
		String[] sp = s.split("[A-Za-z]");
		System.out.println(sp.length);
		for(int i=sp.length-1;i>=0;i--) {
			if (sp[i].equals("")) {
				
			}else if(i>0){
				System.out.print(sp[i]+",");
			}else {
				System.out.print(sp[i]);
			}
		}
	}
}
