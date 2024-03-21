package ch18.sec07.exam02;
import java.io.*;
public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("src/ch18/sec07/exam01/soop.jpg");
		BufferedReader br = new BufferedReader(reader);
		
		int lineNum = 1;
		while(true) {
			String line = br.readLine();
			if(line == null)break;
			System.out.println(lineNum+ "\t"+line);
			lineNum ++;
		}
		br.close();
	}
}
