package Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class Arrays{
	@Test
	public void swapUsingThirdVariable() {
		int a=10;
		int b=20;
		System.out.println("Before swapping: a="+a+", b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping: a="+a+", b="+b);
	}
	
	@Test
	public void swapWithoutUsingThirdVariable() {
		int a=10;
		int b=20;
		System.out.println("Before swapping: a="+a+", b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: a="+a+", b="+b);
	}
	
	@Test
	public void bubbleSortAscending() {
		int a[]= {2,8,3,7,4,6,5,1,9,0};
		for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}	
	
	@Test
	public void bubbleSortDescending() {
		int a[]= {1,0,2,9,3,8,4,7,1,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	@Test
	public void sortCharacterUsingBubbleSort() {
		char[] ch= {'G', 'a', 'z', 'C', 'b', 'q', 'W', 'e', 'M'};
		for(int i=0;i<ch.length;i++) {
			if (ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
			for(int j=0;j<ch.length;j++) {
				if (ch[i]<ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}
	
	@Test
	public void firstMinimumNumberUsingBubbleSort() {
		int a[]= {6,3,8,4,0,9,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.print(a[0]+" is the minimum number in the given array");
	}
	
	@Test
	public void firstMaximumNumberUsingBubbleSort() {
		int a[]= {6,3,8,4,0,9,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println(a[0]+" is the maximum number");
	}
	
	@Test
	public void sumOfFirst3MinimumNumbersAfterSorting() {
		int a[]= {6,3,8,4,0,9,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of first 3 minimum numbers is: "+sum);
	}
	
	@Test
	public void sumOfFirst3MaximumNumbersAfterSorting() {
		int a[]= {6,3,8,4,0,9,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of first 3 maximum numbers is: "+sum);
	}
	
	@Test
	public void maximumNumberWithoutUsingSort() {
		int a[]= {6,3,8,4,0,9,0};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The maximum number is: "+max);
	}
	
	@Test
	public void minimumNumberWithoutUsingSort() {
		int a[]= {6,3,8,4,0,9,0};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The minimum number is: "+min);
	}
	
	@Test
	public void combinationOfNumbersWhoseSumIs11() {
		int[] a= {11,10,9,8,7,6,5,4,3,2,1,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]+a[j]==11) {
					System.out.println(a[i]+" + "+a[j]+" = "+"11");
				}
			}
		}
	}
	
	@Test
	public void missingNumbersFrom1To10() {
		int[] a= {1,4,7};
		for(int i=1;i<=10;i++) {
			boolean flag=false;
			for(int j=0;j<a.length;j++) {
				if (a[j]==i) {
					flag=true;
					break;
				}
			}
			if (flag==false) {
				System.out.println(i+" is not present in the array");
			}
		}
	}
	
	@Test
	public void frequentlyRepeatedNumber() {
		int[] a= {1,4,2,4,3,1,2,1,3,4,1,2,4,4,3,2,2,2,3,1,2,3,4};
		boolean[] b=new boolean[a.length];
		int max=0;
		int rep=a[0];
		for(int i=0;i<a.length;i++) {
			int count=1;
			if (b[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if (count>max) {
					max=count;
					rep=a[i];
				}
			}
		}
		System.out.println(rep+" is the most repeated number");
	}
	
	@Test
	public void frequentlyRepeatedNumbers() {
		int[] a= {1,1,1,4,2,4,3,3,3,1,2,1,3,4,1,2,4,4,3,2,2,2,3,1,2,3,4};
		boolean[] b=new boolean[a.length];
		int max=0;
		int dup=a[0];
		int large=0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			if (b[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
			}
			if (count>max) {
				max=count;
				dup=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			int count=1;
			if (b[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
					}
				}
			}
			if (count==max) {
				System.out.println("Maximum repeated numbers: "+a[i]);
				if (a[i]>large) {
					large=a[i];
				}
			}
		}
		System.out.println("Largest number: "+large);
	}
	
	@Test
	public void occurenceOfNumberInArray() {
		int[] a= {1,3,5,6,5,3,4,5,1,2,7,5,4,5,1};
		boolean[] b=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if (b[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if (count>1) {
					System.out.println(a[i]+" has occured "+count+" times");
				} else {
					System.out.println(a[i]+" is a unique number");
				}
			}
		}
	}
	
	@Test
	public void occurenceOfNumberInArrayUsingMap() {
		int[] a= {1,3,5,6,5,3,4,5,1,2,7,5,4,5,1};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		for(Entry<Integer, Integer> m:map.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" occured "+m.getValue()+" times");
			} else {
				System.out.println(m.getKey()+" is a unique number");
			}
		}
	}
	
	@Test
	public void maxLengthWord() {
		String[] s= {"qwertyr", "tyuityu", "poiukj", "jhg", "jh"};
		String max=s[0];
		int count=s[0].length();
		for(int i=0;i<s.length;i++) {
			int length=s[i].length();
			if (count<length) {
				count=length;
			}
		}
		for(int i=0;i<s.length;i++) {
			if (s[i].length()==count) {
				System.out.println(s[i]);
			}
		}
	}
	
	@Test
	public void maxLengthWordUsingMap() {
		String[] s= {"qwertyr", "tyuityu", "poiukj", "jhg", "jh"};
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for(int i=0;i<s.length;i++) {
			map.put(s[i], 1);
		}
		int max=map.lastKey().length();
		System.out.println(max);
		for(Entry<String, Integer> m:map.entrySet()) {
			if (m.getKey().length()==max) {
				System.out.println(m.getKey());
			}
		}
	}
	
	@Test
	public void add() {
		int[] a= {1,2,3,7,9};
		int[] b= {2,4,6,8};
		int[] c;
		int length;
		if (a.length>b.length) {
			c=new int[a.length];
			length=b.length;
		}else {
			c=new int[b.length];
			length=a.length;
		}
		for(int i=0;i<length;i++) {
			c[i]=a[i]+b[i];
		}
		for(int i=length;i<c.length;i++) {
			if (a.length>b.length) {
				c[i]=a[i];
			} else {
				c[i]=b[i];
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
