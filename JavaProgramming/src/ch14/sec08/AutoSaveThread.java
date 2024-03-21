package ch14.sec08;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	public void run() {
		while(true) {
			save();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
	}
}
