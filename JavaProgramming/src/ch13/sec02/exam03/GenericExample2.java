package ch13.sec02.exam03;

public class GenericExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box();
		box1.content = "100";

		Box<String> box2 = new Box();
		box2.content = "100";

		Box<Integer> box3 = new Box();
		box3.content = 100; 
		// 저장값에 따라 유추해 내서 타입을 지정하지만 구체적인 타입을 지정해주는것이 좋다.
		

		boolean result1 = box1.compare(box2);
		System.out.println("result1 : " + result1);

//		boolean result2 = box1.compare(box3);
//		System.out.println("result : " + result2);
	}

}
