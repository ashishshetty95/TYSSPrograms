package Arrays;

import org.testng.annotations.Test;

public class FirstMinimumNumberWithoutUsingSortTest {
	@Test
	public void min() {
		int[] a= {7, 3, 9, 1, 4, 5};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum number is: "+min);
	}
}
