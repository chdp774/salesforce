package TestJava;

public class JunkData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "125*&^%%&& prasad )(*(&(*&*&(& Selenium";
		// [()^a-zA-Z0-9)]
		str = str.replaceAll("[^a-zA-Z0-9]", " " );
		System.out.println(str);
	}

}
