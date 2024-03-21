package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread thread = new SumThread();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("1~100 합 : "+ thread.getSum());
	}

}
