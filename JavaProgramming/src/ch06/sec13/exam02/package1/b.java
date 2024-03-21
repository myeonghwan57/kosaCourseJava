package ch06.sec13.exam02.package1;

public class b {
	A a1 = new A(true);
	
	A a2 = new A(1); //-> 같은 패키지 내에서 가능 

	// A a3 = new A("문자열"); -> private 생성자 -> 같은 클래스 내에서만 접근 가능.
}
