package ch07.sec10.exam01;

public abstract class MobilePhone { //추상클래스 지정
	public String owner;

	public MobilePhone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	//실행내용을 결정할수 없는 메소드, 추상클래스 내에서만 존재 
	public abstract void InternetSearch();
	
}
