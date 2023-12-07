package String;

import org.testng.annotations.Test;

public class PrintDuplicateNumbersInArrayWithCountTest {
	@Test
	public void duplicate() {
		int[] a= {5,4,4,2,5,4,2,1};
		boolean[] flag=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			int count=1;
			if (flag[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
						flag[j]=true;
					}
				}
			}
			if (count>1) {
				System.out.println(a[i]+" is a duplicate number");
			}
		}
	}
}
