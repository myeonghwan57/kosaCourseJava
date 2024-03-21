package ch06.check.Q20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accountArray = new Account[100];
		Scanner sc = new Scanner(System.in);

		String strNum;

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			strNum = sc.nextLine();
			if (strNum.equals("1")) {
				System.out.println("---------------------------------");
				System.out.println("계좌생성");
				System.out.println("---------------------------------");

				System.out.print("계좌번호: ");
				String ano = sc.nextLine();
				if (ano.equals("")) {
					System.out.println("유효하지 않은 계좌번호 입니다.");
					continue;
				}

				System.out.print("계좌주: ");
				String owner = sc.nextLine();

				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(sc.nextLine());

				Account newAccount = new Account(ano, owner, balance);
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] == null) {
						accountArray[i] = newAccount;
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
					}
				}
				System.out.println("계좌가 생성되었습니다.");
			} else if (strNum.equals("2")) {
				System.out.println("---------------------------------");
				System.out.println("계좌목록");
				System.out.println("---------------------------------");

				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null) {
						System.out.print(accountArray[i].getAccountNum() + "  ");
						System.out.print(accountArray[i].getName() + "  ");
						System.out.println(accountArray[i].getBalance());
					}

				}

			} else if (strNum.equals("3")) {
				System.out.println("---------------------------------");
				System.out.println("예금");
				System.out.println("---------------------------------");
				System.out.print("계좌 번호 > ");
				String ano = sc.nextLine();
				System.out.print("예금액 > ");
				int balance = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null && accountArray[i].getAccountNum().equals(ano)) {
						int sum = accountArray[i].getBalance();
						sum += balance;
						accountArray[i].setBalance(sum);
						System.out.println("예금에 성공했습니다.");
					}
				}

			} else if (strNum.equals("4")) {
				System.out.println("---------------------------------");
				System.out.println("출금");
				System.out.println("---------------------------------");
				System.out.print("계좌 번호 > ");
				String ano = sc.nextLine();
				System.out.print("출금액 > ");
				int withdraw = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null && accountArray[i].getAccountNum().equals(ano)) {
						int sum = accountArray[i].getBalance();
						sum -= withdraw;
						accountArray[i].setBalance(sum);
						System.out.println("출금에 성공했습니다.");
					}
				}

			} else if (strNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
