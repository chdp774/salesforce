package javaPrograms;

public class PalindromeNumber {

	public static void isPalindromeNumber(int num){
		//151	152
		int t;
		int sum=0;
		int r=0;
		t=num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10) + r;
			num = num/10;
		}
		if(t==sum) {
			System.out.println("Palindrome Number");
		}else
			System.out.println("NotPalindrome");
	}
	
	public static void main(String[] args) {
		
		isPalindromeNumber(152);
		
	}

}
