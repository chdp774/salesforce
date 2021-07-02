package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {

		String names[] = {"java", "selenium","selenium", "python", "c", "python", "java"};
		
		// using for loop
		
//		for(int i=0; i<names.length; i++) {
//			for(int j=i+1; j<names.length; j++) {
//				if(names[i].equals(names[j])) {
//					System.out.println(names[i]);
//				}
//				
//			}
//		}
//		
		// using hashMap
		
		Set<String> store = new HashSet<String>();
		for(String str: names) {
			if(store.add(str) == false) {
				System.out.println(str);
			}


		
	}

}
	
}
