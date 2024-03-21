package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cat = new Cat("먼치킨", "black");
//		cat.breath();
//		cat.sound();
//		cat.catchMouse();
//		
//		Dog dog = new Dog("비숑", "white");
//		dog.breath();
//		dog.sound();
//		dog.keepHouse();
//		
//		Animal an = new Cat("야옹", "초록");
//		Cat ca = (Cat)an;
//		ca.catchMouse();
		
		life(new Cat("먼치킨", "흰색"));
		System.out.println();
		life(new Dog("불독", "검정색"));
	}
	public static void life (Animal animal) {
		animal.breath();
		animal.sound();
		
		if(animal instanceof Cat cat) {
			cat.catchMouse();
		}else if(animal instanceof Dog dog) {
			dog.keepHouse();
		}
	}

}
