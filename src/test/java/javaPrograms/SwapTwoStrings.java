package javaPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a = "hello";
		String b = "World";
		
		a = a+b;
		System.out.println(a);
		//a = helloWorld
		b = a.substring(0, (a.length()-b.length()));
		
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
