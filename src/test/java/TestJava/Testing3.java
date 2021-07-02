package TestJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Testing3 {
	//1. Prime Numbers
		//2 3 5 7 11 13 -- least number 2.
	public static boolean isPrimeNumber(int num) {
		if(num <=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
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
	
	
	//2. Palindrome Numbers
		//	151	161	171
	public static void palindrome(int num) {
		int rem;
		int t;
		int sum = 0;
		t = num;
		
		while(num >0) {
			rem = num %10;
			num = num / 10;
			sum = (sum*10) + rem;
		}
		if(t==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not Palindrome");
		}
	}
	//3. ArmStrong Numbers
		//153 1*1*1 5*5*5 3*3*3 =?
		public static void isArmStrongNumber(int num) {
			int rem;
			int t;
			int cube = 0;
			t = num;
			
			while(num >0) {
				rem = num % 10;
				num = num / 10;
				cube = cube + (rem*rem*rem);
			}
			if(t==cube) {
				System.out.println("ArmStrongNumber");
			}else {
				System.out.println("not ArmStrong");
			}
		}
	
	//4. Factorial Number
			//	4 = 4*3*2*1 = ?
		//non recursive
		public static int factorialNumber(int num) {
			int fact = 1;
			if(num == 0) {
				return 1;
			}
			for(int i=1; i<=num; i++) {
				fact = fact*i;
			}
			return fact;
			
		}
		// recursive
		public static int rFact(int num) {
			if(num == 0) {
				return 1;
			}else {
				return num*rFact(num-1);
			}
		}
		
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));
		getPrimeNumbers(100);
		palindrome(151);
		palindrome(161);
		palindrome(150);
		isArmStrongNumber(153);
		isArmStrongNumber(370);
		isArmStrongNumber(150);
		System.out.println(factorialNumber(4));
		System.out.println(factorialNumber(6));
		System.out.println("----------");
		System.out.println(rFact(4));
		System.out.println(rFact(6));
		//8. Missing Number
			// 123457
		int a[] = {1,2,3,4,6,7};
		int sum=0;
		int sum1=0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		for(int j=1; j<=7; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1-sum);
		//10. Swap two strings
		String s1 = "prasad";
		String s2 = "Selenium";
		s1 = s1+s2;
		System.out.println(s1);
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("S1: " +s1);
		System.out.println("S2: " +s2);
		//11. Swap two Intergers
		int x =1;
		int y=2;
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("x values: " +x);
		System.out.println("y values: " +y);
		System.out.println("------------");
		int x1=10;
		int x2=20;
		x1 = x1+x2; //30
		x2 = x1-x2;
		x1 = x1-x2;
		System.out.println("x1 value: " +x1);
		System.out.println("x2 value: " +x2);
		//13. Large & Small
		int list[] = {10,20,30,40,50,60,70,1};
		int large = list[0];
		int small = list[0];
		for(int i=1; i<list.length; i++) {
			if(list[i] > large) {
				large = list[i];
			}else if(list[i] < small) {
				small = list[i];
			}
		}
		System.out.println("large: "+large);
		System.out.println("small: "+small);
		//14. second large
		int num[] = {10,20,55,22,422,45,7};
		int firstLarge = num[0];
		int secondLarge = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = num[i];
			}else if(num[i] > secondLarge){
				secondLarge = num[i];
			}
		}
		System.out.println("First Large: "+firstLarge);
		System.out.println(("Second Large: "+secondLarge));
		//15. reverse String
		String s = "prasad"; //dasarp
		int len = s.length(); //6
		String str = "";
		for(int i=len-1; i>=0; i--) {
			str = str + s.charAt(i);			
		}
		System.out.println(str);
		//option2
		String s123 = "testtest";
		StringBuffer sb = new StringBuffer(s123);
		System.out.println(sb.reverse());
		//16. Reverse Intergers
		int nu = 12345;
		//54321
		int rem;
		int sum123 = 0;
		while(nu>0) {
			rem = nu %10;
			nu = nu / 10;
			sum123 = (sum123*10) + rem;
		}
		System.out.println(sum123);
		// 17. Junk data
		String st = "prasad)*)*)* )((*)(* 123654";
		String value = st.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(value);
		// 18. Remove Duplicate Elements from Sring
		String string[] = {"prasad", "dp", "potti", "prasad", "c", "c"};
		Set<String> hs = new HashSet<String>();
		for(String strr: string) {
			if(hs.add(strr) == false) {
				System.out.println(strr);
			}
		}
		String str11[] = {"p", "s", "p", "d", "s"};
		for(int i=0; i<str11.length; i++) {
			for(int j=i+1; j<str11.length; j++) {
				if(str11[i] == str11[j]) {
					System.out.println(str11[j]);
				}
			}
		}
		// 19. remove duplicate interger from list
		int li[] = {1,1,2,3,6,5,4,52,56,54,5,4};
		for(int i=0; i<li.length; i++) {
			for(int j=i+1; j<li.length; j++) {
				if(li[i] == li[j]) {
					System.out.println(li[j]);
				}
			}
		}
		// Fibbonacci
		//0 1 1 2 3 5 8 13
		int k = 0;
		int l = 1;
		int m;
		Scanner ss = new Scanner(System.in);
		System.out.println("value of :");
		int kk = ss.nextInt();
		for(int i=0; i<=kk; i++) {
			m = k+l;
			System.out.println(m);
			k=l;
			l=m;
		}
		}

}
