package Arrays;

import org.testng.annotations.Test;

public class SumOfFirstNNumbersAfterSorting {
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
		int sum=0;
		int n=3;
		for(int i=a.length-1;i>=a.length-n;i--) {
			sum=sum+a[i];
		}
		System.out.println("Sum of first "+n+" numbers is: "+sum);
	}
}
