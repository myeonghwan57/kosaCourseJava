package ch14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		printThread.setStop(true);
	}

}
