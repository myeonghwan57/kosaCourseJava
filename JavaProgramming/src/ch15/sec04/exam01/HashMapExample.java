package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();

		map.put("hong", 85); // Integer객체 저장 -> int형이 들어가게 된다면 박싱
		map.put("kim", 70);
		map.put("lee", 50);
		map.put("park", 100);
		map.put("choi", 90);
		map.put("hong", 70); // 같은 객체로서 공유 hong.
		System.out.println("entry size: " + map.size());
		System.out.println();

		// 키로 값을 얻기.
		String key = "hong";
		int value = map.get(key); // 자동 언박싱
		System.out.println(key + " : " + value); // 키 값이 같을때 같은 객체를 공유하며 마지막에 입력한 값으로 대체 됨.
		System.out.println();
		// 엔트리를 하나씩 가져와서 키와 값을 출력 -> Set 사용.
		System.out.println("엔트리를 하나씩 가져와서 키와 값을 출력 -> Set 사용.");
		for (Entry<String, Integer> entry : map.entrySet()) {
			String ekey = entry.getKey();
			int evalue = entry.getValue();
			System.out.println(ekey + " : " + evalue);
		}
		System.out.println();
		// 다른 방법으로 출력
		System.out.println("다른 방법으로 출력");
		for (String k : map.keySet()) {
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		// 반복중에 엔트리를 삭제할 경우
		System.out.println("반복중에 엔트리를 삭제할 경우");
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String ekey = entry.getKey();
			int evalue = entry.getValue();

			if (ekey.equals("hong")) {
				iterator.remove();
			} else {
				System.out.println(ekey + " : " + evalue);
			}

		}
	}
}
