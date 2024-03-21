package ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member("blue");
		Member member2 = new Member("blue");
		Member member3 = new Member("red");

		System.out.println(member1.equals("blue")); //false

		if (member1.equals(member2)) { 
			System.out.println("member1 과 member2는 동일합니다.");
		} else {
			System.out.println("member1 과 member2는 동일하지 않습니다."); 
		}
		if (member1.equals(member3)) {
			System.out.println("member1 과 member3은 동일합니다.");
		} else {
			System.out.println("member1 과 member3은 동일하지 않습니다.");
		}
	}

}
