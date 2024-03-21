package ch14.sec03.exam01;

public class BeepPrintExample {

	public static void main(String[] args) { //메인 스레드가 실행

		Runnable runnable = new MusikTask(); // 작업 객체 만들었음
		Thread thread = new Thread(runnable);
		thread.start();
		// 작업 2 ----------------------------------
		for(int i = 0; i< 5; i++) {
			// 스레드가 작업 할 내용
			System.out.println("가사를 출력");
			//0.5초간 일시 정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 작업 2 ----------------------------------
		
	}

}
