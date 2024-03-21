package Practice.ex01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (M-45 < 0) {
			M = 60-Math.abs(M-45);
			if (H == 0) {
				 H = 24 - 1;
			}else {
				H -= 1;
			}
		}else {
			M = M - 45; 
		}
		System.out.print(H);
		System.out.print(M);
	}
	
}
