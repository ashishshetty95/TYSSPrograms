package Arrays;

import org.testng.annotations.Test;

public class PrintFirstMaximumNumberUsingBubbleSortTest {
	@Test
	public void max() {
		int[] a= {18,82,03,64,35,67,73};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("First maximum number is: "+a[0]);
	}
}
