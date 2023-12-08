package NumberSeries;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CheckWhetherGivenNumberIsPrime {
	@Test
	public void prime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if (n%i==0) {
				flag=true;
			}
		}
		if (flag==false && n!=1 && n!=0) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
	}
}
