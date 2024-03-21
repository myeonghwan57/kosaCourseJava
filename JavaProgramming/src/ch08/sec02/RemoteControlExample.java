package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Television();

		rc.turnOn();
		rc.turnOff();

		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();

		use(rc2);
	}

	public static void use(RemoteControl rc) { // 상속에서는 parent객체가 매개변수로 인터페이스에서는 implement 객체가 매개변수로 온다.
		rc.turnOn();
	}
}
