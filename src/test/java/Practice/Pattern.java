package Practice;

import org.testng.annotations.Test;

public class Pattern {
	@Test
	public void pattern1() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
		public void pattern2() {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=i;j<n;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	
	@Test
	public void pattern3() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern4() {
		int n=5;
		for(int i=0;i<n;i++) {
			int m=n;
			for(int j=0;j<n;j++) {
				if ((i+j)<=n-1) {
					System.out.print(m--+" ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern5() {
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
			--m;
			for(int j=1;j<n;j++) {
				if (i>=j) {
					System.out.print(--m+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern6() {
		       int n=3;
		       for(int i=0;i<n;i++){
		           int m=1;
		           for(int j=0;j<n;j++){
		               if(i+j>=n-1){
		                   System.out.print(m++ +" ");
		               }else{
		                   System.out.print("  ");
		               }
		           }
		           --m;
		           for(int j=1;j<n;j++){
		               if(i>=j){
		                   System.out.print(--m+" ");
		               }
		           }
		           System.out.println();
		       }
		    }
	
	@Test
	public void pattern7() {
		int n=5;
		int m=9;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<m;j++) {
				
			}
		}
	}
	
}
