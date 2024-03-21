package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] { 87, 90, 83 };

		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		printItem(new int[] {1,2,3,4,5});
	}

	private static void printItem(int[] scores) {
		// TODO Auto-generated method stub
		for (int i = 0; i < scores.length; i++) {
			System.out.println("socres[" + i + "] : " + scores[i]);
		}
	}

}
