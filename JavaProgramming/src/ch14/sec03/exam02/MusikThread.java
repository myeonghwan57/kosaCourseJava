package ch14.sec03.exam02;

public class MusikThread extends Thread{

	@Override
	public void run() {
	
		for(int i = 0; i< 5; i++) {
			// 스레드가 작업 할 내용
			System.out.println("노래를 재생");
			//0.5초간 일시 정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 작업 1 ----------------------------------
	}

}
