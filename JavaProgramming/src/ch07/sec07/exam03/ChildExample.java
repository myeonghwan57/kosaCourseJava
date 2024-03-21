package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(); // 원본 자체가 자식 객체여야 함 -> 강제 타입 바꾸기 위해서
		parent.field = "data1";
		parent.method1();
		parent.method2();

		// parent.method3(); -> 타입이 parent 라서 child에 있는 method3과 fiedl2를 사용할 수 없다.
		// parent.field2 = "data";

		Child child = (Child) parent; // method2와 field 를 사용하기 위해 강제 타입변환.
		child.field2 = "data2";
		child.method3();

	}

}
