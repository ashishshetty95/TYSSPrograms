package Arrays;

import org.testng.annotations.Test;

public class MissingNumbers1To10Test {
	@Test
	public void missing() {
		int[] a= {1,4,8,9,13};
		for(int num=1;num<=10;num++) {
			boolean flag=false;
			for(int j=0;j<a.length;j++) {
				if (a[j]==num) {
					flag=true;
					break;
				}
			}
			if (flag==false) {
				System.out.println(num+" is not present");
			}
		}
	}
}
