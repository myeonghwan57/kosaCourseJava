package Practice.ex04.boj14425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;

		List<String> listN = new ArrayList<String>();
		List<String> listM = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			listN.add(sc.next());
		}
		for (int i = 0; i < M; i++) {
			listM.add(sc.next());
		}
		
		
		for (int i = 0; i < N; i++) {
			String str = listN.get(i);
			for (int j = 0; j < M; j++) {
				if (str.equals(listM.get(j))) {
					cnt += 1;
					System.out.println(str);
				}
			}
		}
		System.out.println(cnt);
	}
}
