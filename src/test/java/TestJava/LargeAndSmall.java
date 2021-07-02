package TestJava;

public class LargeAndSmall {

	public static void main(String[] args) {
		int a[] = {10,2,25,14,78,95,122,45,3,1};
		int large = a[0];
		int small = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > large) {
				large = a[i];
			}else {
				if(a[i] < small) {
					small = a[i];
				}
			}
				
		}
		
		System.out.println(large);
		System.out.println(small);
		
	}

}
