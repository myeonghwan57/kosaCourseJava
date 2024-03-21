package ch02.sec01;

import java.util.*;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");

		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");

//		Scanner inp = new Scanner(System.in);
//		int input = inp.nextInt();
//		System.out.println("입력 값은 " + input + "입니다.");
	}

}
