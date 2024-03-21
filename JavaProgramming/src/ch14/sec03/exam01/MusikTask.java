package ch14.sec03.exam01;

public class MusikTask implements Runnable{

	@Override
	public void run() {
	
		for(int i = 0; i< 5; i++) {
			// 스레드가 작업 할 내용
			System.out.println("비프음을 발생");
			//0.5초간 일시 정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
