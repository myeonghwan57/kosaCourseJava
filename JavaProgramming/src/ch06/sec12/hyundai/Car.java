package ch06.sec12.hyundai;

import ch06.sec12.hankook.*;
import ch06.sec12.kumho.*;

public class Car {

	//Tire tire = new Tire(); -> 컴파일 에러 : hankook,kumho 둘다 Tire 를 가지고 있어서 어떤 패키지의 어떤 클래스를 사용할지 결정할수 없기 때문에  
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();

}
