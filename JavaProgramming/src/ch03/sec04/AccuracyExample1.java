package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 3;
		double piceUnit = 1.1;
		int num = 2;

		double result = apple - num * piceUnit;
		System.out.println(result);
		
		
		int apple2 = 1;
		int totalPieces = apple2* 10;
		int num2 = 7;
		int result2 = totalPieces - num2;
		System.out.println(result2);
		System.out.println((result2/10.0));
		
		double d = 0.3;
		int a = 3;
		double re = a+d;
		System.out.println(re);
	}

}
