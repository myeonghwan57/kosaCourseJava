package ch07.sec04.exam02;

public class SuperSonicAirplane extends Airplane {
//	public static final int NOMAL = 1;
//	public static final int SUPERSONIC = 2;

	public FlyMode flyMoed = FlyMode.NOMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if (flyMoed == FlyMode.SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		} else {
			super.fly();
		}

	}

}
