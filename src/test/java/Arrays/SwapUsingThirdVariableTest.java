package Arrays;

import org.testng.annotations.Test;

public class SwapUsingThirdVariableTest {
	@Test
	public void swap() {
		int a=10;
		int b=20;
		int c;
		System.out.println("Before Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
