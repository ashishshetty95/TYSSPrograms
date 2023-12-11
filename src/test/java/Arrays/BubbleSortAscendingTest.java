package Arrays;

import java.util.Collections;

import org.testng.annotations.Test;

public class BubbleSortAscendingTest {
	@Test
	public void sort() {
		int[] a= {3, 6, 1, 8, 5, 0, 10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
