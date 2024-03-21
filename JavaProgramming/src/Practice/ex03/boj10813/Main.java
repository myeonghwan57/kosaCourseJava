package Practice.ex03.boj10813;

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
			int tmp = arr[num1 - 1];
			arr[num1 - 1] = arr[num2 - 1];
			arr[num2 - 1] = tmp;

		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
