package ch11.sec06;

public class InsufficientException extends RuntimeException{
	public InsufficientException() {
		
	}
	public InsufficientException(String message) { //예외의 원인을 받아서 부모쪽으로 넘긴다.
		super(message);
	}
}
