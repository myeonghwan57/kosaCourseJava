package ch12.sec03.exam05;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member();
//		member1.setId("user");
//		member1.setName("myeonghwan");
//		member1.setAge(30);
		
		Member member2 = new Member();
//		member2.setId("user");
//		member2.setName("myeonghwan");
//		member2.setAge(30);
		int[] i = {1,2,3};
		String s = new String("안녕");
		System.out.println(s.getClass());
		System.out.println(i.toString());

		System.out.println(member1 == member2);
		System.out.println(member1.equals(member2)); // lombok equals는 객체가 가지고 있는 필드 값을 비교
		System.out.println(member1.hashCode() == member2.hashCode());
		System.out.println(member1.toString());
	}

}
