package Practice.ex03.boj10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		for(int i = 0; i<N ; i++) {
			if(num == arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
