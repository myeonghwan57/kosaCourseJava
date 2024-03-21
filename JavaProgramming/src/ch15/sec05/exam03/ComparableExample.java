package ch15.sec05.exam03;
import java.util.*;
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동",35));
		treeSet.add(new Person("김길동",35));
		treeSet.add(new Person("이길동",35));
		treeSet.add(new Person("박길동",35));
		treeSet.add(new Person("최길동",35));
		treeSet.add(new Person("양길동",35));
		for (Person p : treeSet) {
			System.out.println(p.name);
		}
		
	}

}
