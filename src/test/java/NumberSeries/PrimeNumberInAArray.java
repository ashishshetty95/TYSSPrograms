package NumberSeries;

import org.testng.annotations.Test;

public class PrimeNumberInAArray {
	@Test
	public void prime() {
		int[] a= {7,4,2,1,5,9,8,3};
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int j=2;j<=a[i]/2;j++) {
				if (a[i]%j==0) {
					flag=true;
					break;
				}
			}
			if (flag==false) {
				System.out.println(a[i]+" is a prime number");
			}else {
				System.out.println(a[i]+" is not a prime number");
			}
		}
	}
}
