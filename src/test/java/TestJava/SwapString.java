package TestJava;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prasad";
		String s1 = "babi";
		
		s = s+s1;
		System.out.println(s); //prasadbabi
		//sum.substring(0, s.length()-s1.length())
		//s1 = sum.subSequence(0, (s.length()-s1.length()));
		s1 = s.substring(0, (s.length()-s1.length()));
		System.out.println(s1);
		s = s.substring(s1.length());
		System.out.println(s);
	}

}
