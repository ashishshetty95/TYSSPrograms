package NumberSeries;

import org.testng.annotations.Test;

public class FactorialOfANumberTest {
	@Test
	public void factorial() {
		int n=6;
		int prod=1;
		while(n>0) {
			prod=prod*n;
			n--;
		}
		System.out.println(prod);
	}
}
