package ch14.sec03.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) { // 메인 스레드가 실행

		// 작업 1 ----------------------------------
		Thread thread = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					// 스레드가 작업 할 내용
					System.out.println("노래를 재생");
					// 0.5초간 일시 정지
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		// 작업 1 ----------------------------------
		// 작업 2 ----------------------------------
		for (int i = 0; i < 5; i++) {
			// 스레드가 작업 할 내용
			System.out.println("가사를 출력");
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
