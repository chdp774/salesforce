package javaPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+2+3+4+5+6+7+8+9 == a
		// 1+2+3+4+6+7+8+9 == b
		// a-b
		
		int a[] = {1,2,4};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i]; //7
		}
		
		int sum1 = 0;
		for(int j=1; j<=4; j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println("Missing number is: "+ (sum1-sum));
	}

}
