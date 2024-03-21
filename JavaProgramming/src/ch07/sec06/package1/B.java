package ch07.sec06.package1;

public class B { // 같은 패키지 내에서 사용 가능
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();	
	}
}
