package Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class StringPrograms {
	@Test
	public void reverseString1() {
		String s="ashish";
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverseString2() {
		String s="ashish";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverseString3() {
		String s="ashish";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-(i+1)];
			ch[ch.length-(i+1)]=temp;
		}
		String rev="";
		for(int i=0;i<ch.length;i++) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverseString4() {
		String s="ashish";
		StringBuffer s1=new StringBuffer(s);
		StringBuffer rev=s1.reverse();
		System.out.println(rev);
	}
	
	@Test
	public void reverseWordsInString() {
		String s="My name is java";
		String[] sp=s.split(" ");
		String rev="";
		for(int i=sp.length-1;i>=0;i--) {
			rev=rev+sp[i]+" ";
		}
		System.out.println(rev);
	}
	
	@Test
	public void reveseTheCharactersOfWords() {
		String s="My name is java";
		String[] sp=s.split(" ");
		for(int i=0;i<sp.length;i++) {
			String rev="";
			for(int j=sp[i].length()-1;j>=0;j--) {
				rev=rev+sp[i].charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
	
	@Test
	public void swapFirstAndLastWord() {
		String s="My name is ashish";
		String[] sp = s.split(" ");
		String temp=sp[sp.length-1];
		sp[sp.length-1]=sp[0];
		sp[0]=temp;
		for(int i=0;i<sp.length;i++) {
			System.out.print(sp[i]+" ");
		}
	}
	
	@Test
	public void palindrome() {
		String s="Malayalam".toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("Given string is a palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
	}
	
	@Test
	public void duplicateWordsInASentence() {
		String s="hi helLo hi hello welcome";
		String[] sp=s.split(" ");
		boolean[] b=new boolean[sp.length];
		for(int i=0;i<sp.length;i++) {
			if (b[i]==false) {
				int count=1;
				for(int j=i+1;j<sp.length;j++) {
					if (sp[i].equalsIgnoreCase(sp[j])) {
						count++;
						b[j]=true;
					}
				}
				if (count>1) {
					System.out.println(sp[i]+" is a duplicate word");
					System.out.println(sp[i]+" is repeated for "+count+" times");
				}else if (count==1) {
					System.out.println(sp[i]+" is a unique word");
				}
			}
		}
	}
	
	@Test
	public void duplicateWordsInASentenceUingMap() {
		String s="hi hello hi hello welcome";
		String[] sp=s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i=0;i<sp.length;i++) {
			if (map.containsKey(sp[i])) {
				map.put(sp[i], map.get(sp[i])+1);
			} else {
				map.put(sp[i], 1);
			}
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" is a duplicate word: "+m.getValue());
			}else {
				System.out.println(m.getKey()+" is a unique word: "+m.getValue());
			}
		}
	}
	
	@Test
	public void occurenceOfCharacterInAString() {
		String s="malayalam".toLowerCase();
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if (b[i]==false) {
				int count=1;
				for(int j=i+1;j<s.length();j++) {
					if (s.charAt(i)==s.charAt(j)) {
						count++;
						b[j]=true;
					}
				}
				if (count>1) {
					System.out.println(s.charAt(i)+" is a duplicate character: "+count);
				}else {
					System.out.println(s.charAt(i)+" is a unique character");
				}
			}
		}
	}
	
	@Test
	public void occurenceOfCharacterInAStringUsingMap() {
		String s="malayalam".toLowerCase();
		char[] ch=s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			} else {
				map.put(ch[i], 1);
			}
		}
		for(Entry<Character, Integer> m:map.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" is a repeated character "+m.getValue());
			} else {
				System.out.println(m.getKey()+" is a unique character");
			}
		}
	}
	
	@Test
	public void printOnlyNumbers() {
		String s="aabb1235dd45ee1ff44".toLowerCase();
		String[] ch = s.split("[A-Za-z]");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
	}
	
	@Test
	public void removeDuplicates() {
		String s="hi hello hi hello welcome hey hey";
		String[] sp=s.split(" ");
		boolean b[]=new boolean[sp.length];
		for(int i=0;i<sp.length;i++) {
			if (b[i]==false) {
				for(int j=i+1;j<sp.length;j++) {
					if (sp[i].equals(sp[j])) {
						b[j]=true;
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<sp.length;i++) {
			if (b[i]==false) {
				count++;
				System.out.print(sp[i]+" ");
			}
		}
		System.out.println();
		String[] n=new String[count];
		int c=0;
		for(int i=0;i<sp.length;i++) {
			if (b[i]==false) {
				n[c]=sp[i];
				c++;
			}
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
	}
	
	@Test
	public void seggregate() {
		String s="hgj2b4^kg$gh&";
		String num="";
		String alp="";
		String spl="";
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				alp=alp+s.charAt(i);
			}else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}else {
				spl=spl+s.charAt(i);
			}
		}
		System.out.println(alp);
		System.out.println(num);
		System.out.println(spl);
	}
	
	@Test
	public void sumOfNumbers() {
		String s="jg5jdsbv83shdf6h7kjgsad5";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}
	
	@Test
	public void aabbabc() {
		String s="aabbabc";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				count++;
			}else {
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);
	}
	
	@Test
	public void ILOVEINDIA() {
		String s="I LOVE INDIA";
		String s1=s.replaceAll(" ", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)!=' ') {
				System.out.print(s1.charAt(count--));
			}else {
				System.out.print(s.charAt(i));
			}
		}
	}
	
	@Test
	public void MyNameIsPrakash() {
		String s="My$ coun&try is& $Ind&ia";
		String[] s2=s.split(" ");
		for(int i=0;i<s2.length;i++){
			String r=s2[i].replaceAll("[^a-zA-Z]", "");
			int count=r.length()-1;
			for(int j=0;j<s2[i].length();j++) {
				if (s2[i].charAt(j)>='A' && s2[i].charAt(j)<='Z' || s2[i].charAt(j)>='a' && s2[i].charAt(j)<='z') {
					System.out.print(r.charAt(count--));
				}else {
					System.out.print(s2[i].charAt(j));
				}
			}
			System.out.print(" ");
		}
		
		
	}
	
	
	
}
