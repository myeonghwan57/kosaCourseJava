package ch05.check;

import java.util.Scanner;

public class switchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		String result = "";

		switch (num) {

		case 1:
			result = "num은 1";
			break;
		case 2:
			result = "num은 2";
			break;
		case 3:
			result = "num은 3";
			break;
		case 4:
			result = "num은 4";
			break;
		case 5:
			result = "num은 5";
			break;
		default:
			result = "기본 값";

		}

		System.out.println(num);

	}

}
