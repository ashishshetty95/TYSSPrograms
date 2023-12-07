package String;

import org.testng.annotations.Test;

public class OccurenceOfNumbersInArrayTest {
	@Test
	public void occurence() {
		int[] a= {5,4,4,2,5,4,2,1};
		boolean[] flag=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if (flag[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
						flag[j]=true;
					}
				}
				System.out.println(a[i]+" occured "+count+" times");
			}
		}
	}
}
