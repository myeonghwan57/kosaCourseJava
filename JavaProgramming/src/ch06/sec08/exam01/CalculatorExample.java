package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		myCal.powerOn(); // 전원을 켜는 메소드
		
		int result1 = myCal.plus(6,5);
		System.out.println("result1 : " + result1);
		int x = 10;
		int y = 4;
		double result2 = myCal.divide(x, y);
		System.out.println("result2 : " + result2);
		myCal.powerOff();
		
	}

}