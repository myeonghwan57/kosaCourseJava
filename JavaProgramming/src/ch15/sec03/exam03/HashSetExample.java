package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		Set<String> set = new HashSet<>();

		// 객체 저장
		set.add("저장");
		set.add("삭제");
		set.add("수정");
		set.add("검색");
		set.add("저장"); // 실제 저장이 되는 값은 4개 저장이 중복
		set.add(new String("저장"));// 저장되는 값은 4개
		System.out.println(set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);

			if (element.equals("삭제")) {
				iterator.remove();
			}
		}
		System.out.println();
		for (String str : set) {
			System.out.println(str);
		}
	}

}
