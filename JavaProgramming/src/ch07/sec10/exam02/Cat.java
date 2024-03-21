package ch07.sec10.exam02;

public class Cat extends Animal{
	public String color;
	public String kind;

	public Cat(String kind, String color) {
		super(kind,color);
	}
	
	public void catchMouse() {
		System.out.println("쥐를 잡습니다.");
	}
	
	public void sound() {
		System.out.println("야옹");
	}
}
