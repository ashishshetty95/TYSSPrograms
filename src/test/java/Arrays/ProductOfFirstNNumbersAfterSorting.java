package Arrays;

import org.testng.annotations.Test;

public class ProductOfFirstNNumbersAfterSorting {
	@Test
	public void sum() {
		int[] a= {18,82,03,64,35,67,73};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int product=1;
		int n=3;
		for(int i=0;i<n;i++) {
			product=product*a[i];
		}
		System.out.println("Product of first "+n+" numbers is: "+product);
	}
}
