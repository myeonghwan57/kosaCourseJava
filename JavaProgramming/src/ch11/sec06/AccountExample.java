package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 :  "+ account.getBalance());
		account.withdraw(1000);
		System.out.println("잔고 : "+account.getBalance());
		try {
			account.withdraw(30000);
		} catch (InsufficientException e) {
			// TODO: handle exception
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("잔고 : "+account.getBalance());
	}

}
