package Homework.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 비밀번호 입력받는 변수 passwordA
		String passwordA = br.readLine();
		// 실제 비밀번호를 저장할 passwordB
		String passwordB = "";
		
		// for 반복문을 이용하여 입력한 비밀번호를 인덱스마다 검사하여 실제 비밀번호로 변환 
		for(int i=0; i<passwordA.length(); i++) {
			// 아스키코드표를 이용.
			// 소문자 'z'는 십진법 122에 해당
			// 'z'의 수를 넘어가지 않는다면 if문을 이용하여 변환
			if((char)(passwordA.charAt(i) + 4) <= 'z') {
				passwordB += (char)(passwordA.charAt(i) + 4);		
			} else {  // 'z'의 수(122)를 넘어간다면 --> 123이상이라는 뜻. 다시 'a'의 수 (97)부터 시작하여 변환
				passwordB += (char)(passwordA.charAt(i) + 4 - 26);
			}
		}
		System.out.println(passwordB);
	}

}
