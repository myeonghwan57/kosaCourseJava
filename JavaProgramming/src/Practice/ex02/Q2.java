package Practice.ex02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		int temp = 0;
		for(int i = 1 ;i<N+1;i++) {
			arr[i] = i;
		}
		for(int i = 0 ;i<M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		} 
		for(int i = 1;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
