package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		use(new Television());
		use(new Audio());
	}

	public static void use(RemoteContorl rc) { //다형성 ....
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
	}
}
