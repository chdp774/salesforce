package TestJava;

import java.util.HashSet;

public class DuplicateInteger {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,3,4,5,6,7,8,2,9,9};
		int len = a.length;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
