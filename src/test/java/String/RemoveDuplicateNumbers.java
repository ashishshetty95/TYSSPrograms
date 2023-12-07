package String;

import org.testng.annotations.Test;

public class RemoveDuplicateNumbers {
	@Test
	public void duplicate() {
		int[] a= {5,4,4,2,5,4,2,1};
		boolean[] flag=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if (flag[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						flag[j]=true;
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<flag.length;i++) {
			if (flag[i]==false) {
				count++;
			}
		}
		int[] arr=new int[count];
		int n=0;
		for(int i=0;i<a.length;i++) {
			if (flag[i]==false) {
				arr[n]=a[i];
				n++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
