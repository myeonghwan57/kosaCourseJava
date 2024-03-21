package ch06.sec13.exam02.package2;
import ch06.sec13.exam02.package1.*;
public class C {
	A a1 = new A(true); //-> 접근 가능 public 이기 때문
	
	//A a2 = new A("문자열"); -> default 접근 불가능 같은 클래스 내에서만 접근 가능
	
	//A a3 = new A(1) -> 같은 패키지 내에서만 접근 가능 패키지가 다름.
}
