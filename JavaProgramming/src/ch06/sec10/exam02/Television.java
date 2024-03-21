package ch06.sec10.exam02;
// 정적블록
public class Television {
	static String company="MyCompany"; //객체 마다 가질 필요가 없는 공통 데이터 -> static
	static String model = "LCD";
	static String info;
	
	static { //static 블록 안에는 인스턴스가 오면 안된다.
		info = company + "-" + model;
	}
}
