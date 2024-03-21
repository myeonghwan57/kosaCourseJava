package Practice.ex02;

import java.util.Scanner;

public class Q3boj_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sum = 0;
		double[] scores = new double[N];
		for (int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
		}
		double max = scores[0];
		for (int i = 1; i < N; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
//		System.out.println(max);
		for (int i = 0; i < N; i++) {

			scores[i] = scores[i] / max * 100;

//			System.out.println(scores[i]);
			sum += scores[i];
		}
		double avg = (double) sum / N;
		System.out.println(avg);
	}

}
