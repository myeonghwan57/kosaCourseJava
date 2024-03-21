package ch11.sec05;

import java.io.*;

public class ThrowsExample2 {
	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method() throws IOException, FileNotFoundException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:/Temp/a.txt");
		fis.read();
		fis.close();
	}
}
