package javaPrograms;

public class ArmStrongNumber {
	
	public static void isArmStrongNumber(int num) {
		//153 1*1*1 5*5*5 3*3*3 = 153
		int cube=0;
		int r;
		int t;
		t=num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		
		if(t==cube) {
			System.out.println("ArmStrongNumber");
		}else {
			System.out.println("Not ArmStrongNumber");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrongNumber(153);
	}

}
