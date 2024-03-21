package ch18.sec07.exam01;
import java.io.*;
public class BufferExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 원본 파일과 대상파일의 경로 
		String originalFilePath1 = "D:\\KosaCourse\\projects\\JavaProgramming\\src\\ch18\\sec07\\exam01\\soop.jpg";
		String targetFilePath1 = "C:/temp/targetfile1.jpg";
		
		String originalFilePath2 = BufferExample.class.getResource("soop2.jpg").getPath();
		String targetFilePath2 = "C:/temp/targetfile2.jpg";
		
		//버퍼를 사용하지 않는 입출력 스트림 
		InputStream is1 = new FileInputStream(originalFilePath1);
		OutputStream os1 = new FileOutputStream(targetFilePath1);
		
		//버퍼를 사용하는 입출력 스트림
		InputStream is2 = new FileInputStream(originalFilePath2);
		OutputStream os2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(is2);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		
		//복사 시간 비교하기 (버퍼를 사용하고 안하고 차이)
		long nonBuffertime = copy(is1,os1);
		System.out.println("버퍼 미사용 복사시간:\t"+nonBuffertime+" ns");
		long buffertime = copy(bis,bos);
		System.out.println("버퍼 사용 복사시간:\t"+buffertime+" ns");
		
		is1.close();
		os1.close();
		bis.close();
		bos.close();
		
		
		
	}
	public static long copy(InputStream is, OutputStream os) throws Exception  {
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data == -1 )break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}
}
