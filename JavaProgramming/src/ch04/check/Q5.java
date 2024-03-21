package ch04.check;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (60 - ((i * 4) + (j * 5)) == 0) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

}
