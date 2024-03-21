package ch05.sec07;

public class MultiDimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = { { 80, 90, 96 }, { 76, 88 }, };

		System.out.println("1차원 배열의 길이(반의 수) :" + scores.length);
		System.out.println("2차원 배열의 길이(첫번째 반의 학생 수) " + scores[0].length);
		System.out.println("2차원 배열의 길이(두번째 반의 학생 수) " + scores[1].length);

		System.out.println("scores[0][2] : " + scores[0][2]);
		System.out.println("scores[1][1] : " + scores[1][1]);

		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("class1Avg : " + class1Avg);

		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("class2Avg : " + class2Avg);

		int totalStd = 0;
		int totalSum = 0;

		for (int i = 0; i < scores.length; i++) {
			totalStd += scores[i].length;
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];

			}
		}
		double totalAvg = (double) (totalSum / totalStd);
		System.out.println("총 학생의 평균 : " + totalAvg);
	}

}
