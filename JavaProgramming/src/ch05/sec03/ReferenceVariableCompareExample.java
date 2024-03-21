package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] { 1, 2, 3 };
		int[] arr2 = new int[] { 1, 2, 3 };
		int[] arr3 = arr2;

		System.out.println(arr1 == arr2); // 배열의 원소만 같을뿐 다른 주소값 참조 false
		System.out.println(arr2 == arr3); // 같은 주소값 참조 true

	}

}