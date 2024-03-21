package ch04.check;

import java.util.Scanner;

public class Q7 {

	public static void main(String args[]) {
	
		int save = 0;
		int money;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.println("선택 > ");
			String strNum = scanner.nextLine();
			if (strNum.equals("1")) {
				System.out.println("예금액 > ");
				money =Integer.parseInt(scanner.nextLine());
				save += money;
				scanner.nextLine(); 
			} else if (strNum.equals("2")) {
				System.out.println("출금액 > ");
				money =Integer.parseInt(scanner.nextLine());
				save -= money;
			} else if (strNum.equals("3")) {
				System.out.println("잔고 > " + save);
			} else if (strNum.equals("4")) {
				System.out.println("종료");
				break;
			}
		}
	}
}
