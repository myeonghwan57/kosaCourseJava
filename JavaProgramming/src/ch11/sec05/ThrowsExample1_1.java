package ch11.sec05;

public class ThrowsExample1_1 {

	public static void main(String[] args) {
		findClass();
	}

	public static void findClass() {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("해당 메소드에서 에러를 처리합니다.");
			System.out.println("예외 처리 : " + e.toString());
		}
	}
}
