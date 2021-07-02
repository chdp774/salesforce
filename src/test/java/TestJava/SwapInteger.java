package TestJava;

public class SwapInteger {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c;
//		c = a;
//		a = b;
//		b = c;
//		
		a = a+b; // 15
		b = a-b; // 5
		a = a - b;
		
		
		System.out.println(a);
		System.out.println(b);
	}

}
