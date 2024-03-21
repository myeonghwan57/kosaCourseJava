package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동", 1);
		Student s2 = new Student("홍길동", 1);
		
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체 입니다.");
			}else
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
		}
		else
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
	}

}
