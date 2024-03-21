package ch14.sec03.exam01;

public class BeepPrintExample2 {

	public static void main(String[] args) { // 메인 스레드가 실행

		Thread thread = new Thread(new Runnable() { //Runnable을 익명 구현객체로

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Thread curThread= Thread.currentThread();
					
					// 스레드가 작업 할 내용
					System.out.println("비프음 발생 : "+ curThread.getName());
					// 0.5초간 일시 정지
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}); //익명 구현 객체
		thread.start();
		// 작업 2 ----------------------------------
		for (int i = 0; i < 5; i++) {
			Thread curThread= Thread.currentThread();
		
			// 스레드가 작업 할 내용
			System.out.println("가사를 출력 : "+ curThread.getName());
			// 0.5초간 일시 정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 작업 2 ----------------------------------

	}

}
