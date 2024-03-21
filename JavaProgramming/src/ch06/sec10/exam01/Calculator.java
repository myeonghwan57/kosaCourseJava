package ch06.sec10.exam01;

public class Calculator {
	static double pi = 3.14159;

	static int plus(int x, int y) { // 인스턴스 멤버를 사용하지 않는 메소드라면 static 메소드로 정의한다.
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

}
