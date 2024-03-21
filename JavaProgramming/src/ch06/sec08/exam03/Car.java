package ch06.sec08.exam03;

public class Car {

	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftgas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas 잔량 " + gas + " )");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 " + gas + ")");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
