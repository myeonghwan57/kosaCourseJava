package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = null; // 어떠한 객체도 참조하고 있지 않다. 값을 가지는것은 맞음. null 초기화
		intArray[0] = 10; //NullPointerException
		
		String str= null;
		System.out.println("총 문자 수는 " + str.length());
	}

}