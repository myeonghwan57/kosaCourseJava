package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

		System.out.println("와이파이 상태 : " + myPhone.wifi);
		myPhone.bell();
		myPhone.sendVoice("여보세요 나야");
		myPhone.recivwVoice("거기 잘 지내니");
		myPhone.sendVoice("여보세요 왜 말 안하니?");
		myPhone.hangUp();
		myPhone.setWifi(true);
		myPhone.internet();

	}

}
