package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String str1 = now.toString();
		System.out.println(str1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String str2 = sdf.format(now);
		System.out.println(str2);
		
	}

}
