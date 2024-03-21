package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String originalFileName = "C:/temp/test.jpg";
		String targetFileName = "C:/temp/test2.jpg";

		InputStream is = new FileInputStream("C:/temp/test.jpg");
		OutputStream os = new FileOutputStream("C:/temp/test2.jpg");
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1)break;
			os.write(data,0,num);
		}
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 완료 되었습니다.");
		
	}

}
