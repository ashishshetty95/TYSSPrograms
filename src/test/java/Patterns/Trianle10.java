package Patterns;

import org.testng.annotations.Test;

public class Trianle10 {
	@Test
	public void pattern() {
		int n=5;
		
		for(int i=0;i<n;i++) {
			int m=1;
			for(int j=0;j<n;j++) {
				if (i+j>=n-1) {
					System.out.print(m+++" ");
				}else {
					System.out.print("  ");
				}
			}
			int k=m-2;
			for(int j=1;j<n;j++) {
				if (i>=j) {
					System.out.print(k--+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
