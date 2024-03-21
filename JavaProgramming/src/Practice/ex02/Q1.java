package Practice.ex02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[31];
		Scanner sc = new Scanner(System.in);
		int num;
		for (int i = 0;i<28;i++) {
			num = sc.nextInt(); 
			for(int j = 1; j<31;j++) {
				if(num == j) {
					arr[j] = 1;
				}
			}
		}
		for(int i =1; i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
			
		}
		
	}

}
