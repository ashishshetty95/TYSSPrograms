package Patterns;

import org.testng.annotations.Test;

public class Triangle3 {
	@Test
	public void pattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
