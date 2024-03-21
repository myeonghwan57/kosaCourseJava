package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();

		double result1 = cal1.areaRectangle(10);
		Calculator cal2 = new Calculator();
		double result2 = cal2.areaRectangle(10, 20);

		System.out.println("area1 : " + result1);
		System.out.println("area2 : " + result2);

		System.out.println(cal2.areaRectangle(30.0, 40));
	}

}
