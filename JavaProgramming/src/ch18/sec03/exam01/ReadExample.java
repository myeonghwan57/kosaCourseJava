package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream is = new FileInputStream("C:/temp/test1.db");

			while (true) {
				int data = is.read();
				if (data == -1)
					break;
				System.out.println(data);
			}
			is.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
