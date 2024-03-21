package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "실행");

		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() { //익명 자식 객체 
				public void run() {
					System.out.println(getName() + "실행");
				}
			};
			threadA.start();

		}
		Thread chatThread = new Thread() {
			public void run() {
				System.out.println(getName()+"실행");
			}
		};
		chatThread.setName("chat-Thread");
		chatThread.start();
	}

}
