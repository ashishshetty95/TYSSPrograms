package Patterns;

import org.testng.annotations.Test;

public class Triangle8 {
	@Test
	public void pattern() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i>=j) {
					if (i%2==0) {
						System.out.print(1+" ");
					}else {
						System.out.print(2+" ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
