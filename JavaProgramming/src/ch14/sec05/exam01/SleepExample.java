package ch14.sec05.exam01;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10; i++) {
			System.out.println("소리가 납니다.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
