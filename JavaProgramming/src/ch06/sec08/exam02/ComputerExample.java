package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com = new Computer();
		int result1 = com.sum1(1, 2, 3);
		System.out.println("result1 : " + result1);

		int result2 = com.sum1(1, 2, 3, 4, 5);
		System.out.println("reuslt2 : " + result2);

		int result3 = com.sum2(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result3 : " + result3);

		int[] values = { 1, 2, 3, 4, 5, 6 };
		int result4 = com.sum2(values);
		System.out.println("reslut4 : " + result4);
		
//		int result5 = com.sum2(1, 2, 3);
//		System.out.println("result1 : " + result1);

	}

}
