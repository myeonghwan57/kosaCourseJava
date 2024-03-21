package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch (NullPointerException e) { // 예외가 발생 했을때 예외처리 여러개 작성해도 상관없음 알아서 발생하는 예외로 처리함
			System.out.println("문자열이 없습니다.");
			System.out.println(e.getMessage()); // 예외 이유
			System.out.println("------------------------------------------------------------");
			System.out.println(e.toString());   // 예외종류
			System.out.println("------------------------------------------------------------");
			e.printStackTrace(); 				//예외 발생 추적한 위치까지 출력 가능.
		}

		finally { // 옵션-> 있으면 실행
			System.out.println("마무리 실행");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 실행");

		printLength("ThisIsJava");
		System.out.println();
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
