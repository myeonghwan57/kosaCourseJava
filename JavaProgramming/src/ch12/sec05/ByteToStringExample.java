package ch12.sec05;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		

		
		try {
			String data1 = "자바";
			byte[] arr1 = data1.getBytes("EUC-KR");
			System.out.println("arr1 : " + Arrays.toString(arr1));

			String str1 = new String(arr1,"EUC-KR");
			System.out.println("str1 : " + str1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String data2 = "나스";
			byte[] arr2 = data2.getBytes("EUC-KR");
			System.out.println("arr2 : " + Arrays.toString(arr2));

			String str2 = new String(arr2, "EUC-KR");
			System.out.println("str2 : " + str2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
