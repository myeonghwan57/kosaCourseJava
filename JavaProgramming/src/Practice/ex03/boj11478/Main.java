package Practice.ex03.boj11478;

import java.util.*;

public class Main {
	static HashSet<String> set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		set = new HashSet<String>();

		String name = "";
		for (int i = 0; i < str.length(); i++) {
			name = "";
			for (int j = i; j < str.length(); j++) {
				name += str.substring(j, j + 1);
				System.out.println(name);
				set.add(name);
			}
		}
		System.out.println(set.size());
	}
}
