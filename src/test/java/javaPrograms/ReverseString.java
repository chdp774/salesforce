package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prasad";
		int stringSize = s.length();
		
		String rev = "";
		for(int i=stringSize-1; i>=0; i--) {
			rev = rev+s.charAt(i);;
		}
		System.out.println(rev);
		
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
