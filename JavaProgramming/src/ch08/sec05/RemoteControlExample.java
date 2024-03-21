package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.trunOff();
	}

//	public static void use(RemoteControl rc) { //다형성 ....
//		rc.trunOn();
//		rc.setVolume(5);
//		rc.trunOff();
//	}
}
