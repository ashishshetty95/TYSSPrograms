package Arrays;

import org.testng.annotations.Test;

public class FindFrequentlyRepeatedNumberInArrayTest {
	@Test
	public void frequent() {
		int[] a= {2,1,1,2,1,3,3,3,3,3,2,2,2};
		int frequent=a[0];
		int max=1;
		boolean[] flag=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if (flag[i]==false) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					count++;
					flag[j]=true;
				}
			}
			if (max<count) {
				max=count;
				frequent=a[i];
			}
		}
		}
		System.out.println(frequent+" "+ max);
	}
}
