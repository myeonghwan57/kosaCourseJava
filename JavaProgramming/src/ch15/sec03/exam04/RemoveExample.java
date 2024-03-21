package ch15.sec03.exam04;

import java.util.*;

public class RemoveExample {
	public static void main(String [] args) {
		
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("5");
		set.add("4");
		set.add("3");
		set.add("2");
		
		for(String str : set) {
			if(str.equals("3")) {
				set.remove(str); // 오류 발생 -> 순회하는 대상에서 삭제가 발생하면서 
			}
		}
		for(String str : set) {
			System.out.println(set);
		}
	}
}
