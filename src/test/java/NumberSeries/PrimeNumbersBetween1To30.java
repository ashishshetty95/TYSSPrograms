package NumberSeries;

import org.testng.annotations.Test;

public class PrimeNumbersBetween1To30 {
	@Test
	public void prime() {
		for(int i=1;i<=30;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if (i%j==0) {
					flag=true;
				}
			}
			if (flag==false ) {
				System.out.println(i+" is a prime number");
			}
		}
	}
}
