package ch07.sec03.exam01;

public class Phone {
	public String model;
	public String color;
	public Phone(String model, String color) {
		System.out.println("Phone 생성자 실행");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	public void recivwVoice(String message) {
		System.out.println("상대방 : "+ message );
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
