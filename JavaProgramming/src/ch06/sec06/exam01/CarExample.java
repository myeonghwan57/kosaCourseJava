package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.model = "그랜져";
		myCar.start = true;
		myCar.speed = 200;
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("한계속도 : " + myCar.speed);
		System.out.println();

		Car yourCar = new Car();
		System.out.println("모델명 : " + yourCar.model);
		System.out.println("시동여부 : " + yourCar.start);
		System.out.println("한계속도 : " + yourCar.speed);

	}

}
