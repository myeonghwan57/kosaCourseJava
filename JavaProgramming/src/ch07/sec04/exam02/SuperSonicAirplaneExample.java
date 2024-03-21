package ch07.sec04.exam02;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSonicAirplane sa = new SuperSonicAirplane();

		sa.takeOff();
		sa.fly();
		sa.flyMoed = FlyMode.SUPERSONIC;
		sa.fly();
		sa.flyMoed = FlyMode.NOMAL;
		sa.fly();
		sa.land();

	}

}
