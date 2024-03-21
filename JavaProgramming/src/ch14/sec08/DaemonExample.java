package ch14.sec08;

public class DaemonExample {
	public static void main(String [] args) {
		AutoSaveThread aThread = new AutoSaveThread();
		aThread.setDaemon(true);
		aThread.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}
}
