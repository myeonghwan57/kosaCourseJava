package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<>(); // 같은 타입 생략 
		box1.content= "안녕하세요.";
		
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>(); 
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
