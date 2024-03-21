package ch15.sec05.exam02;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		tm.put("apple", 10);
		tm.put("foever", 60);
		tm.put("description", 40);
		tm.put("ever", 50);
		tm.put("zoo", 80);
		tm.put("base", 20);
		tm.put("guess", 70);
		tm.put("cherry", 30);

		Set<Entry<String, Integer>> es = tm.entrySet();

		for (Entry<String, Integer> entry : es) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();

		Entry<String, Integer> entry = null;
		entry = tm.firstEntry();
		System.out.println("제일 앞 단어 : " + entry.getKey() + "-" + entry.getValue());

		entry = tm.lastEntry();
		System.out.println("제일 마지막 단어 : " + entry.getKey() + "-" + entry.getValue());

		entry = tm.lowerEntry("ever");
		System.out.println("ever 앞 단어 : " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		NavigableMap<String, Integer> desMap = tm.descendingMap();
		Set<Entry<String, Integer>> desEntry = desMap.entrySet();
		System.out.println("내림차순 정렬");
		for (Entry<String, Integer> e : desEntry) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();

		System.out.println("c-h사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = tm.subMap("c", true, "h", false);
		for (Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
	}

}
