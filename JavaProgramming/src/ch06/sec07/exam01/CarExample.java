package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car( "검정", 500);
		myCar.model="그랜져";
		System.out.println(myCar.color);
		System.out.println(myCar.model);
		System.out.println(myCar.maxSpeed);
		
		Car myCar2 = new Car( "노랑", 500);
		
		System.out.println(myCar2.color);
		System.out.println(myCar2.model);
		System.out.println(myCar2.maxSpeed);
		
	}

}
