package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수는 " + score + "입니다.");

		String grade;
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else {
			if (score >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		}

	}
}
