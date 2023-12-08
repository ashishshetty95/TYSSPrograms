package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveRepeatedWordsInaSentenceMap {
	@Test
	public void remove() {
		String s="Hi hello hi Hello welcome".toLowerCase();
		String sp[]=s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i=0;i<sp.length;i++) {
			map.put(sp[i], 1);
		}
		for( Entry<String, Integer> m:map.entrySet()) {
			System.out.print(m.getKey()+" ");
		}
	}
}
