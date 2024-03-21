package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		Vehicle v = new Vehicle();
		d.drive(v);
		
		Vehicle v1 = new Bus();
		d.drive(v1);
		Vehicle v2 = new Taxi();
		d.drive(v2);
		
	}

}
