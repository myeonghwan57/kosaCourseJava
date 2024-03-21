package ch14.sec06.exam01;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public synchronized void setMemory1(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}

	public void setMemory2(int memory) {
		System.out.println("멀티스레드가 실행가능");
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

}
