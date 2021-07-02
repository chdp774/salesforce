package javaPrograms;

public class Testing {
	// Prime number
			// least prime num 2
	//	0 & 1 non prime numbers
	
	public static boolean isPrimeNumber(int num) {
		
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
	
	public static void getNumber(int number) {
		
		for(int i=0; i<=number; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	// ArmStrongNumber
		// 153 370 371
		// 153 = 1*1*1 5*5*5 3*3*3
	
	public static void isArmStrongNumber(int num) {
		
		int r;
		int cube = 0;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;
			cube = cube+ (r*r*r);
			num = num/10;
		}
		if(t==cube) {
			System.out.println("ArmStrongNumber");
		}else {
			System.out.println("Not ArmStrongNumber");
		}
	}
	
	// Factorical Number
		//4 = 4*3*2*1
		// 6 = 6*5*4*3*2*1
	
	// non-recursive type
	public static int isFactorialNumber(int num) {
		
		if(num==0) {
			return 1;
		}
		
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
		
	}
	
	// recursive method
	
	public static int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}else {
			return (num*factorial(num-1));
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 1;
//		int j = i++;
//		System.out.println(i);
//		System.out.println(j);
//		
//		int a = 1;
//		int b = ++a;
//		System.out.println(a);
//		System.out.println(b);

		//Prime Number
//		System.out.println(isPrimeNumber(3));
//		getNumber(20);
		
		//ArmStrongNumber
		
//		isArmStrongNumber(120);
		
		//FactorialNumber
		System.out.println(isFactorialNumber(6));
		System.out.println(factorial(6));
		
	}

}
