package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "여행";
		hobby = null;
		System.out.println(hobby);
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println(kind2); //자동차는 쓰레기가 아님 kind2가 여전히 참조하고 있기때문

	}

}
