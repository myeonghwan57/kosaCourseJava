package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		//공유객체를 주입
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		
		//공유객체를 주입
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		
		//계산기 사용 user1 -> user2
		user1Thread.start();
		user2Thread.start();
	}

}
