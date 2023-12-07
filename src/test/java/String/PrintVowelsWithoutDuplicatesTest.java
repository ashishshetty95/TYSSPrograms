package String;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class PrintVowelsWithoutDuplicatesTest {
	@Test
	public void vowel() {
		String s="india";
		s=s.toLowerCase();
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map.size());
		for( Entry<Character, Integer> m:map.entrySet()) {
			System.out.println(m.getKey());
		}
	}
}
