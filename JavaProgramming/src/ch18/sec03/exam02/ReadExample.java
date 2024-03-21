package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream is = new FileInputStream("C:/temp/test2.db");

			byte[] data = new byte[100];

			while (true) {
				int num = is.read(data);
				System.out.println(num);
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}

			}
			is.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
