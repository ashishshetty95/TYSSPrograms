package Arrays;

import org.testng.annotations.Test;

public class PrintFirstMinimumNumberUsingBubbleSortTest {
	@Test
	public void sort() {
		int[] a= {18, 85, 95, 29, 64, 04};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("First minimum number is: "+a[0]);
	}
}
