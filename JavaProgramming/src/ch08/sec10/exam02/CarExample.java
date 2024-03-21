package ch08.sec10.exam02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동타입변환
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 오류
		System.out.println();
		Bus bus = (Bus)vehicle; //원래의 객체가 버스이므로 버스타입으로 강제 타입 변환 가능
		bus.run();
		bus.checkFare();
	}

}
