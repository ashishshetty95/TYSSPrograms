package NumberSeries;

import org.testng.annotations.Test;

public class SmallestEvenNumberInAnArrayTest {
	@Test
	public void smallest() {
		int[] a= {1,3,7,9,2};
		int small=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]>small) {
				small=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0 && a[i]<small) {
				small=a[i];
			}
		}
		if (small%2==0) {
			System.out.println(small+" is the smallest even number");
		}else {
			System.out.println("There is no even number");
		}
		
	}
}
