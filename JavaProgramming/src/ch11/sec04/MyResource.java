package ch11.sec04;

public class MyResource implements AutoCloseable{ // AutoCloseable 구현하면서 AutoCloseable에 있는 close 재정의
	private String name;

	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource ( " + name + " ) 열기");
	}

	public String read1() {
		System.out.println("MyResource ( " + name + " ) 읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResource ( " + name + " ) 쓰기");
		return "abc";
	}
	public String read3() {
		System.out.println("MyResource ( " + name + " ) 사용");
		return "abc";
	}
	@Override // 재정의 
	public void close() throws Exception {
		System.out.println("MyResource ( " + name + " ) 닫기");
	}
}