package Practice.ex03.boj2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Queue<Integer> stack = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			stack.add(i);
		}
		while (true) {
			if (stack.size() != 1) {
				stack.remove();
				stack.add(stack.poll());
			} else {
				System.out.println(stack.poll());
				break;

			}

		}

	}

}
