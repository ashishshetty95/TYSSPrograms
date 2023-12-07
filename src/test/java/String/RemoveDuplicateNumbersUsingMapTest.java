package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class RemoveDuplicateNumbersUsingMapTest {
	@Test
	public void remove() {
		int[] a= {5,4,4,2,5,4,2,1};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i], null);
		}
		for(Entry<Integer, Integer> m:map.entrySet()) {
			System.out.println(m.getKey());
		}
	}
}
