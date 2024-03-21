package ch07.sec10.exam02;

public class Dog extends Animal{
	public String color;
	public String kind;

	public Dog(String kind, String color) {
		super(kind,color);
	}
	
	public void keepHouse() {
		System.out.println("집을 지킵니다.");
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
}