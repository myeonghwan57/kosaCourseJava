package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자의 수 : " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class.forName("김명환"); 예외 발생
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null); //null 입력과 동시에 콘솔창에 에러 -> 실행 예외.
		System.out.println("프로그램 종료"); // 프로그램 종료는 에러 출력으로 인해 실행 되지 않는다.
	}

}
