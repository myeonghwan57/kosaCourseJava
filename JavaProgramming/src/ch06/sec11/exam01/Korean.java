package ch06.sec11.exam01;

public class Korean {
	// 인스턴스 final 필드 선언 값이 중간에 바뀔수 없음
	final String nation = "대한민국"; // 필드 선언 시에 초기값 대입

	final String ssn;
	// 인스턴스 필드 선언
	String name;

	public Korean(String ssn, String name) {
		this.ssn = ssn; // 생성자에서 초기값 대입
		this.name = name;
	}

}
