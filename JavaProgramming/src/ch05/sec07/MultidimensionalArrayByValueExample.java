package ch05.sec07;

public class MultidimensionalArrayByValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mathScores = new int[2][3];
		int cnt = 0;
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
			}
		}
		System.out.println();
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		int totalSum = 0;
		int totalStd = 0;

		for (int i = 0; i < mathScores.length; i++) {
			totalStd += mathScores[i].length;
			for (int j = 0; j < mathScores[i].length; j++) {
				totalSum += mathScores[i][j];
				cnt += 1;
			}
		}
		double totalMathAvg = (double) totalSum / totalStd;
		System.out.println("총 학생의 수학 점수 평균 : " + totalMathAvg);
		System.out.println(cnt);

		int[][] englishScores = new int[2][3];
		englishScores[0] = new int[3];
		englishScores[1] = new int[3];

		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;

		cnt = 0;
		int totalStd2 = 0;
		int totalSum2 = 0;
		for (int i = 0; i < englishScores.length; i++) {
			totalStd2 += englishScores[i].length;
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishSccore["+i+"]["+j+"] : " +englishScores[i][j] );
				totalSum2 += englishScores[i][j];
				cnt += 1;
			}
		}
		double englishScoreAvg = (double) totalSum2 / totalStd2;
		System.out.println("총 학생의 영어 성적 평균 : " + englishScoreAvg);
		System.out.println(cnt);

	}

}
