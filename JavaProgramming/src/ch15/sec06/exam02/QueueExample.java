package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김명환"));
		messageQueue.offer(new Message("sendKakao", "김자바"));

		while (!messageQueue.isEmpty()) {
			Message m = messageQueue.poll();

			switch (m.command) {
			case "sendMail":
				System.out.println(m.to);
				break;
			case "sendSMS":
				System.out.println(m.to);
				break;
			case "sendKakao":
				System.out.println(m.to);
				break;
			}

		}
	}
}
