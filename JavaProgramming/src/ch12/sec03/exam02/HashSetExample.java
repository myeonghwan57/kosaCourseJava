package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student("홍길동", 1);
		hashSet.add(s1);
		System.out.println("저장된 객체의 수 : "+hashSet.size());
		Student s2 = new Student("홍길동", 1);
		hashSet.add(s2);
		System.out.println("저장된 객체의 수 : "+hashSet.size());
		Student s3 = new Student("홍길동", 2);
		hashSet.add(s3);
		System.out.println("저장된 객체의 수 : "+hashSet.size());
	}

}