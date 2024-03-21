package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		try {
			reader = new FileReader("C:/temp/test.txt");
			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
			reader.close();
			System.out.println();

			reader = new FileReader("C:/temp/test.txt");
			char[] data = new char[100];

			while (true) {
				int num = reader.read(data);
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}

			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
