package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Member, Integer> map = new HashMap<>();
		
		map.put(new Member("hong",25), 50);
		map.put(new Member("hong",25), 60);
		map.put(new Member("hong",25), 70);
		map.put(new Member("hong",25), 80);
		map.put(new Member("hong",25), 90);
		
		System.out.println("총 엔트리 수 : "+map.size());

	}
}
