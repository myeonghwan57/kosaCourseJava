package ch06.sec09;

public class Car {
	static String company = "현대 자동차"; // 현대 자동차는 모든 객체들이 가져야 하고 동일하기 때문에.
	String model;
	int speed;

	Car(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h )");
	}

	static void info() { // static 메소드 
		System.out.println(company + "가 설계한 자동차");
		// this.model = "그랜져" -> 오류 생김. -> this 는 객체 자신을 가리키는데 객체가 없어도 실행되어야 하는 객체가
		// 있어야하는 코드를 사용하면 메소드를 실행할수 없음
	}
}
