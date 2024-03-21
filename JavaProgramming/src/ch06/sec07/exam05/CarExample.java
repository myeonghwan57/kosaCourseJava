package ch06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1  = new Car("자가용");
		System.out.println("car1 company : " + car1.company );
		System.out.println("car1 model : " + car1.model );
		System.out.println("car1 color : " + car1.color );
		System.out.println("car1 speed : " + car1.speed );
		Car car2  = new Car("버스 ","노랑");
		System.out.println("car2 company : " + car2.company );
		System.out.println("car2 model : " + car2.model );
		System.out.println("car2 color : " + car2.color );
		System.out.println("car2 speed : " + car2.speed );
		Car car3  = new Car("택시","흰색",300);
		System.out.println("car3 company : " + car3.company );
		System.out.println("car3 model : " + car3.model );
		System.out.println("car3 color : " + car3.color );
		System.out.println("car3 speed : " + car3.speed );
	}

}
