package Arrays;

import org.testng.annotations.Test;

public class FirstMaximumNumberWithoutUsingSortTest {
	@Test
	public void max() {
		int[] a= {7, 3, 9, 1, 4, 5};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("First maximum number is: "+max);
		
	}
}
