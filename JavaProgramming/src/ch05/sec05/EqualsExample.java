package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) { // 같은 홍길동이라는 문자열을 참조
			System.out.println("strVar1 과 strVar2는 참조가 같습니다.");
		}else {
			System.out.println("strVar1 과 strVar2는 참조가 다릅니다.");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가지고 있습니다.");
		}else {
			System.out.println("다른 문자열을 가지고 있습니다.");
		}
	
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) { // 서로 각자다른 인스턴스의 홍길동을 참조 
			System.out.println("strVar3 과 strVar4는 참조가 같습니다.");
		}else {
			System.out.println("strVar3 과 strVar4는 참조가 다릅니다.");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("같은 문자열을 가지고 있습니다.");
		}else {
			System.out.println("다른 문자열을 가지고 있습니다.");
		}
	
	}

}
