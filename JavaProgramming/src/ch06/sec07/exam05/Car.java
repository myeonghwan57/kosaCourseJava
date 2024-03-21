package ch06.sec07.exam05;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	Car(String model){
		this(model, "검정", 250);
	}
	
	Car(String model , String color){
		this(model, color, 300);
	}
	Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
