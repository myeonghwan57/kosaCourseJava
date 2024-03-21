package ch06.sec08.exam02;

public class CallByValueVsCallByReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1 = 1;// 값 저장
		int[] value2 = { 1 }; // 주소 저장(참조)
		String str = "a";
		callByReference(str);
		System.out.println(str);
		// int result=0;
//		result = callByValue(value1);
		callByValue(value1);
		System.out.println("value1 : " + value1); // 1출력

		callByReference(value2);
		System.out.println("value2 : " + value2[0]);
		
		Member member = new Member("박자바");
		System.out.println("name : "+ member.name);
		callByReference(member);
		System.out.println("after callByReference");
		System.out.println("name : "+ member.name);
	}

	
	
	
	
	
	
	public static void callByValue(int arg) {
		arg = 2;
	}
//	public static int callByValue(int arg) { 
//		arg = 2;
//		return arg;
//	}

	public static void callByReference(int[] arg) {
		arg[0] = 2;
	}

	public static void callByReference(String str) {
		str = "b";
	}

	public static void callByReference(Member arg) {
		arg.name = "김자바";
	}

}
