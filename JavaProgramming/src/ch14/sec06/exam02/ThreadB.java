package ch14.sec06.exam02;

public class ThreadB extends Thread{
private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	public void run() {
		for(int i = 0; i< 1000;i++) {
			workObject.methodB();
		}
	}
	
}
