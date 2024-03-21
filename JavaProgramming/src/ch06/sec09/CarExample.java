package ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		Car.info();
		
		myCar.setSpeed(120);
		yourCar.setSpeed(200);
		myCar.run();
		yourCar.run();
		
		System.out.println();

	}

}
