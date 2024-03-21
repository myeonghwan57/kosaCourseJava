package ch12.check.Q12;

public class IntegerCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		//System.out.println(obj1 == obj2); //포장값의 범위 때문에 같은 객체주소를 공유함.
		//System.out.println(obj3 == obj4);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));

	}

}
