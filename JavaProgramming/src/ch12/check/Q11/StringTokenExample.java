package ch12.check.Q11;

import java.util.StringTokenizer;

public class StringTokenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data,",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
