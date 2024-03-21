package ch06.sec06;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("s1 변수가 Student  객체를 참조합니다.");
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		Student s3 = s2;
		if(s1 == s2) {
			System.out.println("s1 와 s2는 같은 객체");
		}else{
			System.out.println("s1 와 s2는 다른 객체");
		}
		
		if(s2 == s3) {
			System.out.println("s2 와 s3은 같은 객체");
		}else {
			System.out.println("s2 와 s3은 다른 객체");
		}
	}

}
