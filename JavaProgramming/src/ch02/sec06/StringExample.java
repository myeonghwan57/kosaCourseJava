package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str =  "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("입니다\n");
		
		String str1 = "    ";
		String str2 = "A";
		
		String str4 = str1+str2;
		System.out.println(str4);
		
	}

}
