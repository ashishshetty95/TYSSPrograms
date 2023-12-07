package Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.testng.annotations.Test;
public class FindFrequentlyRepeatedNumbersInArrayTest {
	@Test
	public void frequent() {
		int[] a= {2,1,1,2,1,1,3,3,3,3,3,2,2,2};
		int max=1;
		TreeMap<Integer, Integer> t = new TreeMap<Integer, Integer>();
		boolean[] flag=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if (flag[i]==false) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					count++;
					flag[j]=true;
				}
			}
			if (max<count) {
				max=count;
			}
			t.put(a[i], count);
		}
		 }
		for(Entry<Integer, Integer> tm:t.entrySet()) {
			if (tm.getValue()==max) {
				System.out.println(tm.getKey());
			}
		}
	}
}
