package TestJava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String str[] = {"java", "c", "java", "pynthon", "Basic", "kkd", "kkd", "c"};
		int len = str.length;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(str[i] == str[j]) {
					System.out.println(str[j]);
				}
			}
		}
		
		System.out.println("--------------");
		
		Set<String> store = new HashSet<String>();
		for(String str1: str) {
//			if(str1.equals(store)) {
//				System.out.println(str1);
//			}
			if(store.add(str1) == false) {
				System.out.println(str1);
			}
		}
	}

}
