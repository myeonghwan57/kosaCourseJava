package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class.forName("java.lang.String"); -> ClassNotFoundException 예외 발생. 
		//해당 예외는 일반 예외기 때문에 예외처리코드 반드시 작성(아래 코드 참조)	
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재 합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()); // 예외 이유.
			e.printStackTrace(); //예외가 어디서 발생 했는지 추적 후 출력.
		}
	}

}
