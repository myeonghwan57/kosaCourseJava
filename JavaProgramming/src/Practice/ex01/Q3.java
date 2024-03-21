package Practice.ex01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int cost = input.nextInt();
		int count = input.nextInt();
		
		for (int i = 0 ; i < count ; i++) {
			int price = input.nextInt();
			int cnt = input.nextInt();
			cost -= (price*cnt);
		}
		if (cost<0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
