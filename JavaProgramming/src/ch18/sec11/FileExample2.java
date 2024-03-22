package ch18.sec11;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = ""+"id:winter\n"+"email:winter@gamil.com\n"+"tel:010-1234-1234";
			Path path = Paths.get("C:/temp/user.txt");
			Files.writeString(Paths.get("C:/temp/user.txt"), data, Charset.forName("UTF-8"));
			
			System.out.println("파일 유형: "+Files.probeContentType(path));
			System.out.println("파일 유형: "+Files.size(path)+"bytes");
			
			String content = Files.readString(path,Charset.forName("UTF-8"));
			System.out.println(content);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
