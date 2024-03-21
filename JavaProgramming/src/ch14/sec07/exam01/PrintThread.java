package ch14.sec07.exam01;

public class PrintThread extends Thread{

	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		try {
			while(!stop) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
				System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
