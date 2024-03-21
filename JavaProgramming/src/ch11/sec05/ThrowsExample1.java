package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String [] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("해당 메소드를 호출한 곳에서 에러를 처리합니다.");
			System.out.println("예외 처리 : "+ e.toString());
		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
