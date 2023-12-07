package Arrays;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class FindGreaterNumberInFrequentlyRepeatedNumbersInArrayTest {
	@Test
	public void great() {
		int[] a= {1,2,3,7,5,1,2,3,5,4,2,1,3,1,2,3};
		boolean[] flag=new boolean[a.length];
		int max=1;
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if (flag[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						count++;
						flag[j]=true;
					}
				}
				tm.put(a[i], count);
				if (count>max) {
					max=count;
				}
			}
		}
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(Entry<Integer, Integer> t:tm.entrySet()) {
			if (t.getValue()==max) {
				System.out.println(t.getKey()+" "+max);
				ts.add(t.getKey());
			}
		}
		System.out.println("Greater number is: "+ts.last());
	}
}
