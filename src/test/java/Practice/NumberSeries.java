package Practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class NumberSeries {
	@Test
	public void prime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if (n%i==0) {
				flag=true;
			}
		}
		if (flag==false && n!=1 && n!=0) {
			System.out.println(n+" is a prime number");
		} else {
			System.out.println(n+" is not a prime number");
		}
	}

	@Test
	public void factorial() {
		int n=0, m=n;
		int prod=1;
		while(n>0) {
			prod=prod*n;
			n--;
		}
		System.out.println("Factorial of "+m+" is: "+prod);
	}
	
	@Test
	public void fibonacci() {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int sum=0;
		int n=8;
		while(n>8) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			n--;
		}
	}
	
	@Test
	public void palindrome() {
		int n=123656321, m=n;
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if (m==rev) {
			System.out.println("Given number is a palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
	}
	
	@Test
	public void primeNumberInGivenArray() {
		int[] a= {4,9,7,2,6,17,19,21, 141};
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int j=2;j<=a[i]/2;j++) {
				if (a[i]%j==0) {
					flag=true;
				}
			}
			if (flag==false) {
				System.out.println(a[i]+" is a prime number");
			}
		}
	}
	
	@Test
	public void primeNumbersBetween1To30() {
		for(int i=1;i<=30;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if (i%j==0) {
					flag=true;
				}
			}
			if (flag==false && i!=1) {
				System.out.println(i+" is a prime number");
			}
		}
	}
	
	@Test
	public void smallestEvenNumberInArray() {
		int[] a= {3,5,7,9,11,2,4,0};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if (a[i]<=max && a[i]%2==0) {
				min=a[i];
			}
		}
		if (min%2==0) {
			System.out.println(min+" is the smallest even number");
		}else {
			System.out.println("There are no even numbers in the given array");
		}
	}
	
	@Test
	public void squareOfNumbers1To10() {
		for(int i=1;i<=10;i++) {
			int sqrt=i*i;
			System.out.println("Square of "+i+" is "+sqrt);
		}
	}
	
	@Test
	public void squareRoot() {
		int n=1;
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if (i*i==n) {
				flag=true;
				break;
			}
		}
		if (flag==true) {
			System.out.println(n+" is a perfect square");
		}else {
			System.out.println(n+" is not a perfect square");
		}
		
	}
	
	@Test
	public void perfectSquareBetween1To100() {
		for(int i=1;i<=100;i++) {
			boolean flag=false;
			for(int j=1;j<=i;j++) {
				if (j*j==i) {
					flag=true;
				}
			}
			if (flag) {
				System.out.println(i+" is a perfect square");
			}
		}
	}
	
	@Test
	public void factors() {
		int n=2000;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if (i*j==n) {
					System.out.println(i+" "+j+" are the factors");
				}
			}
		}
	}
}
