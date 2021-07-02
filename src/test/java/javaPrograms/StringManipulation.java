package javaPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "         i have been in the jail form last 2years";
		String str1 = "i have Been in the jail form last 2years";
		
		//int l = str.length();
		char st = str.charAt(3);
		System.out.println(st);
		
		int a1= str.indexOf("a");
		System.out.println(a1);
		int a2 = str.indexOf("a", a1+1);
		System.out.println(a2);
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		
		//split
		String s1 = "prasad no is one only";
		String st1[] = s1.split(" ");
		for(int i=0; i<st1.length; i++) {
			System.out.println(st1[i]);
		}

	}

}
