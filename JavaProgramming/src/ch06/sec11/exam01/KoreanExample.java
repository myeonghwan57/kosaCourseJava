package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korean k1 = new Korean("123456-1234567", "김자바");

		// k1.nation ="USA"; 오류 -> final 필드로 선언 된것은 중간에 값이 바뀔수 없다.
		// k1.ssn = "123-123"; 오류 -> final 필드로 선언 된것은 중간에 값이 바뀔수 없다.
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);

		k1.name = "박자바"; // final 이 아닌 필드는 값 변경 가능 .
		System.out.println(k1.name);

	}

}
