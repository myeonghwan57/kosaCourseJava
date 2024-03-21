package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-7173-1709";
		System.out.println(regExp);
		System.out.println(data);
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "myeonghwan57@gamil.com";
		System.out.println(regExp);
		System.out.println(data);
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}
