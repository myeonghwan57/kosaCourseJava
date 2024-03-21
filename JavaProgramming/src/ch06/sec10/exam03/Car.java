package ch06.sec10.exam03;

public class Car {
	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	static void simulate() {
		Car myCar = new Car(); // 객체를 생성하고 인스턴스 멤버를 활용하는것이기 때문에 정적메소드이지만 사용가능.
		myCar.speed = 200;
		myCar.run();
	}

	public static void main(String[] args) {
		simulate(); //정적 메소드 호출 simulate 안에 객체를 생성하고 그 해당 객체를 통해 인스턴스 멤버에 접근 할 수 있도록 구성.
		Car myCar = new Car();

		myCar.speed = 100;
		myCar.run();
	}
}