package TestJava;

public class FactorialNumber {
	// 5 = 5*4*3*2*1
	// 3 = 3*2*1 = 6
	
	public static int factorial(int num) {
		int fact = 1;
		if(num ==0)
			return 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	// recursive
	
	public static int recFac(int num) {
		if(num == 0)
			return 1;
		else
			return (num*recFac(num-1));
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(recFac(3));
	}

	
}
