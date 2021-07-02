package TestJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Testing2 {
	
		// prime number
//		public static boolean isPrimeNumber(int num) {
//			if(num <=1) {
//				return false;
//			}
//			for(int i=2; i<num; i++) {
//				if(num % i == 0) {
//					return false;
//				}
//			}
//			return true;
//		}
//		
//		public static void getprime(int num) {
//			for(int i=2; i<=num; i++) {
//				if(isPrimeNumber(i)) {
//					System.out.println(i);
//				}
//			}
//		}
//		// Palindrome Number
			// 151 161
//		public static void isPalindromeNumber(int num) {
//			int rem;
//			int sum = 0;
//			int t;
//			t=num;
//			while(num>0) {
//				rem = num%10;
//				sum = (sum*10) + rem;
//				num = num/10;
//			}
//			if(t==sum) {
//				System.out.println("palindom");
//			}else {
//				System.out.println("not palindrome");
//			}
//		}
//		
//		//3. ArmStrong Number
//		public static void isArmStrongNumber(int num) {
//			// 153 1*1*1 5*5*5 3*3*3
//			int cube=0;
//			int rem;
//			int t;
//			t = num;
//			while (num > 0) {
//				rem = num%10;
//				cube = cube + (rem*rem*rem);
//				num = num/10;
//			}
//			if(t==cube) {
//				System.out.println("ArmStrongNumber");
//			}else {
//				System.out.println("Not ArmStrong");
//			}
//		}
//		//4. Factorial number
//		// non recursive
//		public static int isFactorial(int num) {
//			int fact = 1;
//			if(num ==0)
//				return 1;
//			
//			for(int i=1; i<=num; i++) {
//				fact = fact * i;
//			}
//			return fact;
//		}
//		// recursive
//		
//		public static int fact(int num) {
//			if(num == 0)
//				return 1;
//			else
//				return num*(fact(num-1));
//		}
//	
//		
//	
	public static void main(String[] args) {
		// 21. Fibonacci
			// 0 1 1 2 3 5 8 13 21 
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Fibonacci Number: ");
//		int num = s.nextInt();
//		int a=0;
//		int b=1;
//		int c;
//		for(int i=0; i<=num; i++) {
//			c = a+b;
//			System.out.println(c);
//			
//			a=b;
//			b=c;
//		}
		//20. Remove Duplicate integer from Array
//		int a[] = {1,2,3,4,5,6,6,7,5};
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] == a[j]) {
//					System.out.println(a[j]);
//				}
//			}
//		}
		// 19. Remove Duplicate elements form String
//		String s[] = {"prasad", "dp", "potti", "prasad", "satya", "dp", "potti"};
//		for(int i=0; i<s.length; i++) {
//			for (int j=i+1; j<s.length;j++) {
//				if(s[i] == s[j]) {
//					System.out.println(s[j]);
//				}
//			}
//		}
//		
		// option2 using HashSet
//		Set<String> set = new HashSet<String>();
//		for(String str: s) {
//			if(set.add(str) == false) {
//				System.out.println(str);
//			}
//		}
		// 18. 
		// 17. Junk values
//		String val = ")(*(*^(& prasad 13234 )(*)*";
//		
//		String value = val.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(value);
//		// 16. Reverse Integer
//		int a = 12345;
//			//54321
//		int rem;
//		int rev = 0;
//		while  (a > 0) {
//			rem = a%10;
//			rev = rev*10 + rem;
//			a= a/10;
//		}
//		System.out.println(rev);
//		// option 2;
//		int num = 54321;
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
//		
//		// 15. Reverse String
//		String str = "prasad"; // dasarp
//		int len = str.length(); // 6
//		String r = "";
//		for(int i=len-1; i>=0; i--) {
//			r = r + str.charAt(i);
//		}
//		System.out.println(r);
//		// option2
//		StringBuffer sb1 = new StringBuffer(str);
//		System.out.println(sb1.reverse());
//		
//		//14. Second Large Number
//		int num1[] = {100,25,36,54,78,908,20,15};
//		int large = num1[0];
//		int secondLarge = num1[0];
//		
//		for(int i=0; i<num1.length; i++) {
//			if(num1[i] > large) {
//				secondLarge = large;
//				large = num1[i];
//			}else if( num1[i] > secondLarge){
//				secondLarge = num1[i];
//			}
//		}
//		System.out.println("large : " +large);
//		System.out.println("secondLarge : " +secondLarge);
//		//13. large & small
//		int num2[] = {0,10,20,30,40,50,60};
//		int large1 = num2[0];
//		int small1 = num2[0];
//		for(int i=1; i<num2.length;i++) {
//			if(num2[i] > large1) {
//				large1 = num2[i];
//			}else if(num2[i] < small1) {
//				small1 = num2[i];
//			}
//		}
//		System.out.println("large: " +large1);
//		System.out.println("small: " +small1);
//		//12. add two  martrix
//		//11. swap two integers
//		int x = 10;
//		int y = 20;
//		int z;
//		z=x;
//		x=y;
//		y=z;
//		System.out.println("After: x"+x );
//		System.out.println("After: y"+y);
		//10. swap two Strings
//		x= x+y;
//		y = x-y;
//		x = x-y;
//		System.out.println("After: x "+x );
//		System.out.println("After: y "+y);
		//10. Swap two Strings
//		String st1 = "prasad";
//		String st2 = "hello";
//		
//		st1 = st1+st2; // prasadhello
//		st2 = st1.substring(0, (st1.length() - st2.length()));
//		st1 = st1.substring(st2.length());
//		
//		System.out.println("after st1 " +st1);
//		System.out.println("after st2 " +st2);
		//9. permutation of string
		//8. missing number
//		int num3[] = {1,2,3,6,5,4,8};
//		int sum = 0;
//		int sum1 = 0;
//		for(int i=0; i<num3.length; i++) {
//			sum = sum + num3[i]; 
//		}
//		for(int j=1; j<=8; j++) {
//			sum1 = sum1 + j;
//		}
//		System.out.println(sum1-sum);
		//4. Factorial Number
			//4 = 4*3*2*1
//		System.out.println(isFactorial(10));
//		System.out.println("fact method "+fact(10));
//		
//		//3. ArmStrongNumber
//		isArmStrongNumber(370);
//		isArmStrongNumber(10);
//		
//		//2. Pallindrome
//		isPalindromeNumber(151);
//		
//		//1. primeNumbers
//		System.out.println(isPrimeNumber(0));
//		System.out.println(isPrimeNumber(3));
//		System.out.println(isPrimeNumber(200));
//		getprime(100);
	}

}
