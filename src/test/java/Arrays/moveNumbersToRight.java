package Arrays;

import org.testng.annotations.Test;

public class moveNumbersToRight {
	@Test
	public void test() {
		int[] a= {1,0,2,3,0,5,5,8,0};
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
			if (a[i]==0 && n>i) {
				int temp=a[i];
				a[i]=a[n];
				a[n]=temp;
				n--;
			}
		}
		for(int v:a) {
			System.out.print(v+" ");
		}
	}
}
