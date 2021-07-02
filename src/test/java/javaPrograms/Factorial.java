package javaPrograms;

public class Factorial {
	// 4 = 4*3*2*1 = ?
	// 5 = 5*4*3*2*1 = ?
	
	//with-out recursive -- for loop
	public static int factorial(int num) {
		int fact = 0;
		if(num==0) {
			return 1;
		}
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	
	//with recursive
	
	public static int rfactorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return (num * rfactorial(num-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
