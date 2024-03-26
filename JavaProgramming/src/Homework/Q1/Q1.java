package Homework.Q1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 입력을 받기 위해 Scanner 타입 변수 생성
		Scanner scan = new Scanner(System.in);
		// 몇번 출력할건지 입력받는 변수 n
		int n = scan.nextInt();
		// 입력받은 만큼 출력
		for(int i=0; i<n; i++) {
			System.out.println("Hello MyCompany!");
		}
	}
}
