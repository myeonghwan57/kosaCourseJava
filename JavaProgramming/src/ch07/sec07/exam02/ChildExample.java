package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		Parent p = ch;
		Parent p1 = new Parent();
		
		p.method();
		p.method2();
//		p.method3(); 자식 메소드는 사용할 수 없다.  
		p.method4(); 
		
		ch.method();
		ch.method2();
		ch.method3();
		ch.method4();
		
		p1.method4();
	}

}
