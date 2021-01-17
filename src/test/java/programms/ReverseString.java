package programms;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {

	//	String s[] = { "java", "javascript", "ruby", "python", "c", "java" };
//
//		for (int i = 0; i < s.length; i++) {
//
//			for (int j = i + 1; j < s.length; j++) {
//				if (s[i].equals(s[j])) {
//					System.out.println(s[i]);
//				}
//
//			}
//
//		}
		
	
//		Set <String> store = new HashSet<String>();
//		for(String x : s) {
//			if(store.add(x)==false) {
//				System.out.println(x);
//			}
//		}
//		
		String s= "sachina";
		char r []= s.toCharArray();
		
		
		Set <Object> stor = new HashSet<Object>();
	for(char x : r) {
			if(stor.add(x)==false) {
				System.out.println(x);
			}
		}
		int j = s.length();
		String rev= "";
		for (int l = j-1;  l>=0; l--) {
			 rev = rev + s.charAt(l);
		}
		System.out.println(rev);
		char c []= s.toCharArray();
		
		
		
		System.out.println(c.length);
		int x=0;
		for(char xy : c) {
			switch(xy) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				x++;
			
				
			}
			
				}
		int p=j-x; 
		System.out.println("consonant=" + p);
		
		
		
		
		
 
	}

}
