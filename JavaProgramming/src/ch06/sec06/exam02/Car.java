package ch06.sec06.exam02;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	
	int maxSpeed = 350;
	int speed;
	
	Car(){ // 기본 생성자 선언
 		model = "그랜져";
 		color = "검정";
	}
	void run () {
		speed = 60;
	}
}
