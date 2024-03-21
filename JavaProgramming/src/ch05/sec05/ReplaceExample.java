package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
		String newStr = oldStr.replace("String", "스트링");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
