package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class UniqueWordsInAStringUsingMapTest {
	public class DuplicateWordsInASentenceUsingMapTest {
		@Test
		public void duplicate() {
			String s="hi hello hi hello welcome".toLowerCase();
			String[] sp=s.split(" ");
			LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
			for(int i=0;i<sp.length;i++) {
				if (map.containsKey(sp[i])) {
					map.put(sp[i], map.get(sp[i])+1);
				}else {
					map.put(sp[i], 1);
				}
			}
			for(Entry<String, Integer> m:map.entrySet()) {
				if (m.getValue()==1) {
					System.out.println(m.getKey()+" is a unique word");
				}
			}
		}
	}
}
