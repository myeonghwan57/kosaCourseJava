package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("Samsung", "Android");

		String strObj = myPhone.toString();

		System.out.println(strObj);
		System.out.println(myPhone);

		String info = "나의 폰은 " + myPhone; // 문자열 더하기 객체를 하게 되면 자동으로 toString 메서드를 불러오는게 java 규칙
		String info2 = "나의 폰은 " + myPhone.toString(); // 결국 위의 문장과 해당문장은 동등한 의미.
		System.out.println(info);
		System.out.println(info2);
		
		Integer obj = 3;// 박싱 -> 기본 타입의 숫자를 객체타입으로 박싱
		System.out.println(obj); // Integer객체의 이름(변수명)을 사용하게 되면 자동으로 toString호출해 int 값을 문자열로 변환해 반환
		System.out.println(obj.toString());
		
		int result = obj + 3;// 산수 연산 언박싱해서 산수 연산
		System.out.println(result);

		String str = obj + "3"; // 문자열 결합 toString 을 자동으로 호출해서 문자열 결합
		System.out.println(str);
		

	}

}
