package Practice;

import org.testng.annotations.Test;

public class Interview {
	@Test
	public void secondLargest() {
		int[] a= {1,12,10,2,4,7,9,5,8,3,11,13};
		int max=0;
		int smax=0;
		int min=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if (a[i]>smax && a[i]<max) {
				smax=a[i];
			}
			if ( a[i]>min && a[i]<smin) {
				smin=a[i];
			}
		}
		System.out.println(max+" "+smax);
		System.out.println(min+" "+smin);
		
	}
}
