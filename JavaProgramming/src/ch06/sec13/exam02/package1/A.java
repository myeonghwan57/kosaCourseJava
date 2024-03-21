package ch06.sec13.exam02.package1;

public class A {

	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A (boolean b) { //public -> 모든패키지 내에서 생성자 호출 가능
		
	}
	A (int b) { // default -> 같은 패키지 내에서만 호출 가능
		
	}
	private A(String str) { //private -> 클래스 내부에서만 생성자 호출가능
		
	}
	
}
