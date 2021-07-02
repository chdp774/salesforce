package javaPrograms;

public class SwapTwoIntergers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 10;
		
		// Using 3rd var :t
//		int t;
//		
//		t = x;
//		x = y;
//		y = t;
//		
		// WithOut using 3rd Var: using + operator
		
		x = x+y; //15
		y = x - y; // 5
		x = x - y; //5
		
		// using * operator
		
		x = x * y; //50
		y = x / y; 
		x = x / y; 
		
		
		
		System.out.println(x);
		System.out.println(y);
	}

}
