package ch08.sec11.exam01;

public class Car {
	Tire tire = new HankookTire();
	Tire tire2 = new KumhoTire();

	void run() {
		tire.roll();
		tire2.roll();
	}
}
