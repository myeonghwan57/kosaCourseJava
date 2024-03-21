package ch18.sec06;
import java.io.*;
public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			write ("문자 변환 스트림을 사용합니다.");
			System.out.println(read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		Writer writer = new OutputStreamWriter(os,"UTF-8"); //문자열을 바이트로 변환. 보조 스트림 
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
	public static String read() throws Exception{
		InputStream is = new FileInputStream("C:/temp/test.txt");
		Reader reader = new InputStreamReader(is,"UTF-8"); //문자열을 바이트로 변환. 보조 스트림 
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data,0,num);
		return str;
		

	}
}
