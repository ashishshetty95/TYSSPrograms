package Arrays;

import org.testng.annotations.Test;

public class BubbleSortDescendingOrderTest {
	@Test
	public void sort() {
		int[] a= {8, 3, 6, 81, 47, 26, 76};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
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
