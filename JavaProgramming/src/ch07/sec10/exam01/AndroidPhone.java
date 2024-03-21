package ch07.sec10.exam01;

public class AndroidPhone extends MobilePhone {

	public AndroidPhone(String owner) {
		super(owner);
	}
	//추상메서드 재정의
	public void InternetSearch() {
		System.out.println("안드로이드 폰으로 인터넷 검색을 합니다.");
	}
}
