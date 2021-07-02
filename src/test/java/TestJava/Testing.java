package TestJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Testing {
	//1. primeNumbers
		// 2,3,5,7,11,13
		public static boolean isPrimeNumber(int num) {
			if(num<=1) {
				return false;
			}
			
			for(int i=2; i<num; i++) {
				if(num % 2 == 0) {
					return false;
				}
			}
			return true;
		}
		
		public static void getPrimeNumbers(int num) {
			for(int i=2; i<=num; i++) {
				if(isPrimeNumber(i)) {
					System.out.print(" " + i);
				}
			}
		}
		
		//2. palindrome Number
			//151 161 171
		
		public static void isPalindromeNumber(int num) {
			int rem;
			int sum=0;
			int t;
			t=num;
			
			while (num >0) {
				rem = num%10;
				num = num/10;
				sum = (sum*10) + rem;
			}
			if(t==sum) {
				System.out.println("palindromeNumber");
			}else {
				System.out.println("not PalindromeNumber");
			}
		}
		
		// 3. ArmStrongNumber
			// 153 1*1*1 5*5*5 3*3*3
		
		public static void isArmStrongNumber(int num) {
			int rem;
			int cube =0;
			int t;
			t=num;
			while(num > 0) {
				rem = num%10;
				num = num/10;
				cube = cube + (rem*rem*rem);
			}
			if(t==cube) {
				System.out.println("is ArmStrongNumber");
			}else {
				System.out.println("Not ArmStrong");
			}
		}
		
		// 4. Factorial Number
			// 4 = 4*3*2*1 =?
			// 6 = 6*5*4*3*2*1 = ?
		
		// non recursive 
		public static int isFactorialNumber(int num) {
			int fact =1;
			while(num == 0) {
				return 1;
			}
			
			for(int i=1; i<=num; i++) {
				fact = fact*i;
			}
			return fact;
		}
		
		// recursive function
		public static int Factorial(int num) {
			if(num == 0 ) {
				return 1;
			}else {
				return num*Factorial(num-1);
			}
		}
		
		
		public static void main(String[] args) {
		
		// 1. prime Number
//			System.out.println(isPrimeNumber(2));
//			System.out.println(isPrimeNumber(9));
//			getPrimeNumbers(20);
//		
		// 2. palindrome Number
//			isPalindromeNumber(151);	
//			isPalindromeNumber(15);
//			isPalindromeNumber(161);
//			isPalindromeNumber(122);
//		
		// 3. ArmStrongNumber
//		isArmStrongNumber(370);
//		isArmStrongNumber(153);
//		isArmStrongNumber(1);
//		isArmStrongNumber(150);
		
			
		//4. Factorial Number
//		System.out.println(isFactorialNumber(6));
//		System.out.println(Factorial(5));
//		System.out.println(Factorial(0));
		
	//********************************************************		
		// 5.6.7. Star programs
			
		/*
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 
		 * 
		 */	
//		
//			for(int i=1; i<=5; i++) {
//				for(int j=1; j<=i; j++) {
//					System.out.print(" " +j);
//				}
//				System.out.println();
//			}
//			
//			/*
//			 *	***** 
//			 * 	****
//			 * 	***
//			 * 	**
//			 * 	*
//			*/
//			
//			for(int i=0; i<=5; i++) {
//				for(int j=5; j>=i; j--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			System.out.println("------------------");
//			
//			/*
//			 * 		
//			 * 	
//			*/
//			
//			for(int i=0; i<5; i++) {
//				for(int j=5; j>i; j--) {
//					System.out.print(" ");
//				}
//				for(int k=0; k<=i;k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			System.out.println("----------------");
//			/*
//			*/
//			
//			for(int i=0; i<5; i++) {
//				for(int j=0; j<i; j++) {
//					System.out.print(" ");
//				}
//				for(int k=5; k>i; k--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("-------------------");
//			
//			int alpha = 65;
//			for(int i=0; i<5;i++) {
//				for(int j =0; j<=i; j++) {
//					System.out.print((char)(alpha+j)+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("-------------------");
//			
//			int alpha1 = 65;
//			for(int i=0; i<5; i++) {
//				for(int j=0; j<=i; j++) {
//					System.out.print((char)(alpha1));
//				}
//				alpha1++;
//				System.out.println();
//			}
//			
//			for(int i=0; i<10; i++) {
//				for(int j=10; j>=i; j--){
//					System.out.print(" ");
//				}
//				for(int k=0; k<=i; k++) {
//					System.out.print(" *");
//				}
//				System.out.println();
//			}
			
			//8. Missing Number
//				int a[] = {1,2,3,5,6,7,8,9};
//				int len = a.length;
//				int sum=0;
//				int sum1 =0;
//				for(int i=0; i<len; i++) {
//					sum = sum+a[i];
//				}
//				for(int j=1; j<=9; j++) {
//					sum1 = sum1+j;
//				}
//				System.out.println(sum1-sum);
			//9. permutation of String
				
			//10. Swap to strings
				
//			String i1 = "prasad";
//			String j = "potti";
//			
//			i1 = i1+j; // prasadpotti
//			
//			j = i1.substring(0, i1.length()-j.length() );
//			System.out.println("J value " +j);
//			i1 = i1.substring(j.length());
//			System.out.println("I value " +i1);
			
			//11. Swap to Integers
			
//			int x = 12345;
//			int y = 67890;
//			
//			x = x+y;
//			y = x-y;
//			x = x-y;
//			
//			int z;
//			z=x;
//			x=y;
//			y=z;
			
//			System.out.println("x value " +x);
//			System.out.println("y value " +y);
						
			
			//13. Large & Small
			
//			int num[] = {10,20,30,1,40,50};
//			int large = num[0];
//			int small = num[0];
//			
//			for(int i=1; i<num.length; i++) {
//				if(num[i] > large) {
//					large = num[i];
//				}else {
//					if(num[i] < small) {
//						small = num[i];
//					}
//				}
//			}
//			System.out.println("Large " +large);
//			System.out.println("Small " +small);
			
			// 14. 2nd Large Number
			
//			int numbers[] = {55,10,20,11,22,33,44,88,33,0,11};
//			int large = numbers[0];
//			int secondLarge = numbers[0];
//			
//			for(int i=0; i<numbers.length; i++) {
//				if(numbers[i] > large) {
//					secondLarge = large;
//					large = numbers[i];
//				}else {
//					if(numbers[i] > secondLarge ) {
//						secondLarge = numbers[i];
//					}
//				}
//			
//			}
//			System.out.println("Second Large Number " +secondLarge);
//			System.out.println("Large Number " +large);
			// 15. Reverse String
//			String s = "hello";
//			int len = s.length(); // 5
//			String st = "";
//			
//			for(int i=len-1; i>=0; i--) {
//				st = st+ (s.charAt(i));
//			}
//			System.out.println(st);
//			
//			
//			StringBuffer sb = new StringBuffer(s);
//			System.out.println(sb.reverse());			
//			
				
			// 15. Reverse Integer
//			int num = 123456789;
			// 54321
//			int rem;
//			int rev = 0;
//			
//			while (num >0) {
//				
//				rem = num%10;
//				num = num/10;
//				rev = rev*10 + rem;
//			}
//			
//			System.out.println(rev);
//			StringBuffer sb1 = new StringBuffer(String.valueOf(num));
//			System.out.println(sb1.reverse());
			
			//16. Remove Duplicate elements from String
			
//			String str[] = {"java", "c", "integer", "c", "boolean", "integer", "java"};
			
			//using for loop
//			for(int i=0; i<str.length; i++) {
//				for(int j=i+1; j<str.length; j++) {
//					if(str[i] == str[j]) {
//						System.out.println(str[j]);
//						System.out.println(j);
//					}
//				}
//	
//			}
			
			// using HashSet
//			Set<String> data =new HashSet<String>();
//			for(String s: str ) {
//				if(data.add(s) == false) {
//					System.out.println(s);
//				}
			
			//17. Remove Duplicate integers from Array
			
//			int array[] = {1,2,3,4,5,6,6,1};
//			int len = array.length;
//			for(int i=0; i<len; i++) {
//				for(int j=i+1; j<len; j++) {
//					if(array[i] == array[j]) {
//						System.out.println(array[j]);
//					}
//				}
			
			// 18. Fibonacci service
				//0 1 2 3 5 8 13 21 
			Scanner s = new Scanner(System.in);
			System.out.println("Enter fibonaci value: ");
			int value = s.nextInt();
			int a=0; 
			int b = 1;
			int c;
			for(int i=0; i<=value; i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}

}
