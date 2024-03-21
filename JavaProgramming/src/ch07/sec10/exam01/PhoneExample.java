package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone mp = new AndroidPhone("홍길동"); //실체 클래스로 객체를 생성해야 한다.
		
		
		mp.turnOn();
		mp.InternetSearch(); // 안드로이드 폰에 재정의 된 search 메소드 사용.
		mp.turnOff();
		
		
		mp = new IPhone("김자바");
		mp.turnOn(); 
		mp.InternetSearch(); // 아이폰에 재정의 된 search 메소드 사용.
		mp.turnOff();
	}

}
 