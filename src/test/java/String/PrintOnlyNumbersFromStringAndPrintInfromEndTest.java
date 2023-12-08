package String;

import org.testng.annotations.Test;

public class PrintOnlyNumbersFromStringAndPrintInfromEndTest {
	@Test
	public void reverse() {
		String s="aabb1235dd45ee1ff44".toLowerCase();
		String[] sp = s.split("[A-Za-z]");
		for(int i=sp.length-1;i>=0;i--) {
			System.out.print(sp[i]+" ");
		}
	}
}
