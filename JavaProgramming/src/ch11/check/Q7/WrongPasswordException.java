package ch11.check.Q7;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}

}
