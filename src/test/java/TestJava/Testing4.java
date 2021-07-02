package TestJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Testing4 {
	// 1. Prime Number
		// 2 3 5 7 11 13
	public static boolean isPrimeNumber(int num) {
		if(num <=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;		
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	// 2. Palindrome Number
		// 151 161
	public static void isPalindrome(int num) {
		int rem;
		int t;
		t = num;
		int sum = 0;
		while(num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = (sum*10) + rem;
		}
		if(t==sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	// 3. Armstrong 
		//153 1*1*1 5*5*5 3*3*3
	public static void isArmStrong(int num) {
		int rem;
		int cube = 0;
		int result;
		result = num;
		while(num > 0) {
			rem = num % 10;
			num = num / 10;
			cube = cube + (rem*rem*rem);
			
		}
		if(result == cube) {
			System.out.println("ArmStrong");
		}else {
			System.out.println("not ArmStrong");
		}
	}
	
	// 4. Factorical
		// 4 = 4*3*2*1
		// 0 = 1
			// non recurssive
	public static int isFactorical(int num) {
		if (num == 0) {
			return 1;
		}
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}
			// recursive
	public static int fact(int num) {
		if(num == 0) {
			return 1;
		}else
			return num*fact(num-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(15));
		System.out.println(isPrimeNumber(11));
		getPrimeNumbers(100);
		isPalindrome(151);
		isPalindrome(150);
		isPalindrome(161);
		isArmStrong(153);
		isArmStrong(370);
		isArmStrong(150);
		System.out.println(isFactorical(4));
		System.out.println(isFactorical(6));
		System.out.println("-----");
		System.out.println(isFactorical(4));
		System.out.println(isFactorical(6));
		// 5. Star programs
				// *
				// **
				// ***
				// ****
				// *****
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int i=0; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int l=0; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int l=5; l>i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		
		int num = 65;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(num + j));
			}
			System.out.println();
		}
		int num1 = 0;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(num1);
			}
			num1++;
			System.out.println();
		}
		int num2=1;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((num2 + j));
			}
			System.out.println();
		}
		
		//8. Missing Numbers
			// 1 2 3 4 6 7
		int n[] = {1,2,4,5,3,7};
		int sum=0;
		int sum1=0;
		for(int i=0; i<n.length; i++) {
			sum = sum + n[i];
		}
		for(int j=1; j<=7; j++) {
			sum1 = sum1+ j;
		}
		System.out.println(sum1-sum);
		//9. Swap two Integers
		int x =1;
		int y=2;
//		int z;
//		z=x;
//		x=y;
//		y=z;
//		System.out.println("x value: "+x);
//		System.out.println("y value: "+y);
		
		x=x+y;
		y=x-y;
		x = x-y;
		System.out.println("x value: "+x);
		System.out.println("y value: " +y);
		//10. Swap two Strings
		String s = "prasad";
		String s1 = "Auto";
		s = s+s1; // prasadAuto
		System.out.println(s);
		s1 = s.substring(0, s.length()-s1.length());
		s = s.substring(s1.length());
		System.out.println("s value: " +s);
		System.out.println("s1 value: "+s1);
		// 11. Small & Large
		int nu[] = {10,2,5,66,5,88,5,11,77};
		int large = nu[0];
		int small = nu[0];
		
		for(int i=0; i<nu.length; i++) {
			if(nu[i] > large) {
				large = nu[i];
			}else if(nu[i] < small) {
				small = nu[i];
			}
		}
		System.out.println("small: "+small);
		System.out.println("Large: "+large);
		// 12. Second Large
		
		int nn[] = {15,5,654,1,4,1,6,1,6,5,165,0};
		int firstLarge = nn[0];
		int secondLarge = nn[0];
		
		for(int i=0; i<nn.length; i++) {
			if(nn[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = nn[i];
			}else if(nn[i] > secondLarge) {
				secondLarge = nn[i];
			}
		}
		System.out.println("FirstLarge: "+firstLarge);
		System.out.println("secondLarge: "+secondLarge);
		
		//13. Reverse Integer
		int number = 123456;
		int rem;
		int su =0;
		while(number > 0) {
			rem = number % 10;
			number = number / 10;
			su = (su*10) + rem;
		}
		System.out.println(su);
		
		int numb = 54321;
		StringBuffer sb1 = new StringBuffer(String.valueOf(numb));
		System.out.println(sb1.reverse());
		//14. Reverse String
		String string = "prasadu";
		int len = string.length();
		String str = "";
		for(int i=len-1; i>=0; i--) {
			str = str + string.charAt(i);
		}
		System.out.println(str);
//		StringBuffer sb = new StringBuffer(string);
//		System.out.println(sb.reverse());
		//15. Junk data
		String str1 = "3214(*)*132 prasad(*&(^*;";
		
		String value = str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(value);
		//16. Duplicate elements from string
		String strin[] = {"prasad", "dp", "c", "dp", "potti", "c"};
		for(int i=0; i<strin.length; i++) {
			for(int j=i+1; j<strin.length; j++) {
				if(strin[i] == strin[j]) {
					System.out.println(strin[j]);
				}
			}
		}
		System.out.println("--------");
//		Set<String> set = new HashSet<String>();
//		for(String st: strin) {
//			if(set.add(st) == false) {
//				System.out.println(st);
//			}
//		}
		// 17. Duplicate integers form list;
		int numbe[] = {10,1,2,4,5,4,5,10,8,9};
		for(int i=0; i<numbe.length; i++) {
			for(int j=i+1; j<numbe.length; j++) {
				if(numbe[i] == numbe[j]) {
					System.out.println(numbe[j]);
				}
			}
		}
		
		// 18. fibboncci
		
		int a=0;
		int b=1;
		int c;
		Scanner ss = new Scanner(System.in);
		System.out.println("Number: " );
		int l = ss.nextInt();
		for(int i=0; i<=l; i++) {
			
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
		}
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=0; j--) {
				
			}
		}
	}

}
