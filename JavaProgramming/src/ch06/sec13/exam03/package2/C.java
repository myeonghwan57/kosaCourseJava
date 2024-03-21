package ch06.sec13.exam03.package2; // 패키지가 다름.

import ch06.sec13.exam03.package1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 2; default 
		//a.field13 = 3; private
		
		
		a.method1();
		// a.method2(); default
		//a.method3(); private 메소드 접근 불가. 
	}
}
