package javaPrograms;

public class SmallAndLargeNumbers {

	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50,0};
		
		int large = numbers[0];
		int small = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>large) {
				large = numbers[i];
			}else {
				if(numbers[i]<small) {
					small = numbers[i];
				}
			}
		}
		System.out.println("small number" + small);
		System.out.println("large number" + large);
	}

}
