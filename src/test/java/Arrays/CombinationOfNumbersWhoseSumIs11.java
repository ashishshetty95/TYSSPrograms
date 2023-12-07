package Arrays;

import org.testng.annotations.Test;

public class CombinationOfNumbersWhoseSumIs11 {
	@Test
	public void sum() {
		int[] a= {1,5,7,3,6,2,9,10,0,11,4,8};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]+a[j]==11) {
					System.out.println(a[i]+" + "+a[j]+" = "+"11");
				}
			}
		}
	}
}
