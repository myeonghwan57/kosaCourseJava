package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {

	public D() {
		super();
	}

	public void method1() {
		this.field = "value";
		this.method(); //상속을 통해서 가능

	}

	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method(); 직접 객체를 생성하는것은 안됨

	}
}
