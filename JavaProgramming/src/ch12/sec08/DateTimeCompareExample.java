package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDate = LocalDateTime.of(2024, 3,15,0,0,0);
		System.out.println("시작일:" + startDate.format(dtf));
		LocalDateTime endDate = LocalDateTime.of(2024, 12,25,0,0,0);
		System.out.println("종료일:" + endDate.format(dtf));
		
		if(startDate.isBefore(endDate)) {
			System.out.println("진행중입니다.");
		}else if(startDate.isAfter(endDate)) {
			System.out.println("종료했습니다.");
		}else if(startDate.equals(endDate)) {
			System.out.println("종료합니다.");
		}
		long remainYear = startDate.until(endDate, ChronoUnit.YEARS);
		long remainMonth = startDate.until(endDate, ChronoUnit.MONTHS);
		long remainDay = startDate.until(endDate, ChronoUnit.DAYS);
		long remainHour = startDate.until(endDate, ChronoUnit.HOURS);
		long remainMinute = startDate.until(endDate, ChronoUnit.MINUTES);
		long remainSecond = startDate.until(endDate, ChronoUnit.SECONDS);
		
		System.out.println("남은 해 : "+remainYear);
		System.out.println("남은 월 : "+remainMonth);
		System.out.println("남은 일 : "+remainDay);
		System.out.println("남은 시 : "+remainHour);
		System.out.println("남은 분 : "+remainMinute);
		System.out.println("남은 초 : "+remainSecond);
		
	}

}
