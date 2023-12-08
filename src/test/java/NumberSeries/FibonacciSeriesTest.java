package NumberSeries;

import org.testng.annotations.Test;

public class FibonacciSeriesTest {
	@Test
	public void fibonacci() {
		int a=0;
		int b=1;
		int n=1;
		System.out.println(a);
		System.out.println(b);
		while (n<=10) {
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			n++;
		}
	}
}
