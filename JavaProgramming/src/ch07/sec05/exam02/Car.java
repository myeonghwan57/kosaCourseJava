package ch07.sec05.exam02;

public class Car {
	public int speed;

	public void speedUp() {

		speed += 1;
		System.out.println("차의 속도를 올립니다. 속도 : " + speed);
	}

	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
