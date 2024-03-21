package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		
		System.out.println(value1);
		System.out.println(value2);
		
//		String str1 = String.valueOf(10);
//		String str2 = String.valueOf(3.14);
	
		String str1 = "" + 10;
		String str2 = "" + 3.14;
	
		System.out.println(str1);
		System.out.println(str2);
	}

}
