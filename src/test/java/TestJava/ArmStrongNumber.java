package TestJava;

public class ArmStrongNumber {
	// 151 1*1*1 5*5*5 3*3*3
	
	public static void ArmStrong(int num) {
		int r;
		int cube = 0;
		int t;
		t = num;
		while(num > 0) {
			r = num%10;
			cube = cube + (r*r*r);
			num = num/10;
		}
		if(t==cube) {
			System.out.println("ArmStrongNumber");
		}else {
			System.out.println("not ArmStrongNumber");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmStrong(151);
	}

}
