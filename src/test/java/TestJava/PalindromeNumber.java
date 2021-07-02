package TestJava;

public class PalindromeNumber {
		//151 
	
	public static void Palindrome(int num) {

		int r=0;
		int sum = 0;
		int t;
		
		t=num;
		
		while(num != 0 ) {
			r = num%10;
			sum = (sum*10) + r;
			num = num/10;
		}
		if(t==sum) {
			System.out.println("palindromeNumber");
		}else {
			System.out.println("not PalindromeNumber");
		}
	}
	public static void main(String[] args) {
		Palindrome(191);
	}

}
