package Patterns;

import org.testng.annotations.Test;
/* 	* * * * * 
 	* * * *   
 	* * *     
 	* *       
 	*
 */
public class Triangle2 {
	@Test
	public void pattern() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
