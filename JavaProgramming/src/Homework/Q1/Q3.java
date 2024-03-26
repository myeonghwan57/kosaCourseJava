package Homework.Q1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 버퍼를 이용하여 입력 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 세 자연수 곱의 결과를 저장할 변수 value 선언과 동시에 초기화
		int value = 1;
		
		// 입력받은 값들을 String 배열에 차곡차곡 저장
		String[] data = br.readLine().split(",");
		
		// 입력받은 값들을 차례로 곱하는 for문
		for(int i=0; i<data.length; i++) {
			value *= Integer.parseInt(data[i]);
		}
		
		// 0~9의 갯수를 저장할 int배열
		int[] count = new int[10];
		
		// while 반복문을 이용하여 카운트
		while(value > 0) {
			count[value % 10]++;
			value /= 10;
		}
		
		// 결과 출력
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
