package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class PrintMinimumLengthWordsInGivenArrayUsingMapTest {
	@Test
	public void min() {
		String s[]= {"ab", "abc", "abcd", "ef", "edcf", "lj"};
		int min=0;
		boolean[] flag=new boolean[s.length];
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i=0;i<s.length;i++) {
			map.put(s[i], s[i].length());
			if (flag[i]==false) {
				for(int j=i+1;j<s.length;j++) {
					if (s[i].length()<=s[j].length()) {
						min=s[i].length();
						flag[j]=true;
					}
				}
			}
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			if (m.getValue()==min) {
				System.out.println(m.getKey());
			}
		}
	}
}
