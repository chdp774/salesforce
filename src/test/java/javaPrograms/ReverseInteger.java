package javaPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev = 0;
		
		while(num !=0) {
			rev = rev *10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
	//2 option
		
		int num1 = 123456;
	StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
		
	}

}
