package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() { // 한번에 하나의 스레드만 실행하도록 설정 synchronized
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodA 작업 실행");
		// 상대방을 실행 대기 상태로 만들고
		notify(); //synchronized 안에서만 사용돼야 한다.
		try {
			// 자신은 일시정지 상태로 돌아간다.
			wait(); //synchronized 안에서만 사용돼야 한다.
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodB 작업 실행");
		// 상대방을 실행 대기 상태로 만들고
		notify();
		try {
			// 자신은 일시정지 상태로 돌아간다.
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
