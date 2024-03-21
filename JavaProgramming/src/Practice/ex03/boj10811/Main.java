package Practice.ex03.boj10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < M; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			for (int j = num1, k = num2; j <= k; j++, k--) {
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
			}

		}
		for(int i =0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
