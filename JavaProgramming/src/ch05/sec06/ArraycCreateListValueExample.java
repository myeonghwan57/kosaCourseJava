package ch05.sec06;

public class ArraycCreateListValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;

		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		printItem(scores);
	}

	private static void printItem(int[] scores) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "]" + scores[i]);
		}

	}

}
