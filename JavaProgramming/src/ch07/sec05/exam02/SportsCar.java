package ch07.sec05.exam02;

public class SportsCar extends Car {
	public void speedUp() {
		speed += 10;
		System.out.println("스포츠카의 속도를 올립니다. 속도 : " + speed);
	}

//	public void stop() { 메소드를 재정의 할 수 없다.
//		System.out.println("스포츠카를 멈춥니다");
//		speed = 0;
//	}
}
