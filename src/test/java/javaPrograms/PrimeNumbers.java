package javaPrograms;

public class PrimeNumbers {
	
	// print prime number from 1 to 100
	
	public static boolean isPrimeNum(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getNumber(int Number) {
		
		for(int i=2; i<=Number; i++) {
			if(isPrimeNum(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(isPrimeNum(99));
		getNumber(100);	
	}

}
