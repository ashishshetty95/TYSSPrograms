package Patterns;

import org.testng.annotations.Test;

public class Triangle9 {
	@Test
	public void pattern() {
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i>=j) {
					System.out.print(ch++ +" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
