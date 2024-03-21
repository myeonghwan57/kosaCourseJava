package ch07.sec09;

public class Student extends Person{
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name); // 부모 Person
		this.studentNo = studentNo;
		
	}
//	public void walk() {
//		System.out.println("학생이 걷습니다.");
//	}
	public void study() {
		System.out.println("학생이 공부를 합니다.");
	}
}
