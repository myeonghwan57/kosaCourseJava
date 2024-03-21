package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNum = new int[6];
		Random random = new Random(2);

		System.out.print("선택번호:");

		for (int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			System.out.print(selectNum[i] + " ");
		}
		System.out.println();

		int[] winningNum = new int[6];

		random = new Random(2);
		System.out.print("당첨번호:");
		for (int i = 0; i < 6; i++) {
			winningNum[i] = random.nextInt(45) + 1;
			System.out.print(winningNum[i] + " ");
		}
		System.out.println();
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);

		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.print("당첨여부 : ");
		if (result == true) {
			System.out.println("당첨!");
		} else {
			System.out.println("낙첨ㅠㅠ");
		}

	}

}
