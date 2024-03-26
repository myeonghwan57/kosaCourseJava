package Homework.Q1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws Exception {
		// 빠른 입력을 위해 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 홀수의 총 합을 구하는 변수 선언과 초기화
		int oddSum = 0;
		// 최솟값을 받은 변수 선언과 초기화
		int minValue = Integer.MAX_VALUE;
		// 입력받은 값들을 String 배열에 차곡차곡 저장
		String[] data = br.readLine().split(",");

		// 입력받은 수만큼 반복하여 홀수를 골라내고 합과 홀수의 최솟값을 구함
		for (int i = 0; i < data.length; i++) {
			int number = Integer.parseInt(data[i]);
			if (number % 2 == 1) {
				oddSum += number;
				if (minValue > number) {
					minValue = number;
				}
			}
		}
		// 홀수가 존재하지 않는다면 -1 출력
		if (oddSum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(oddSum);
			System.out.println(minValue);
		}
	}

}
