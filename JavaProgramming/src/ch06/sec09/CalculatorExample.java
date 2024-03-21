package ch06.sec09;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Calculator cal2 = new Calculator();
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		Calculator.pi = 3.141592; 
		int result = cal.plus(10, 5);
		System.out.println(cal2.pi);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
