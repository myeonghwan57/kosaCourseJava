package ch04.check;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;

		while (num1 + num2 != 5) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;

			System.out.println("("+num1+","+num2+")");
		}
	}
}
