package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컬렉션 객체 생성
		List<Board> list = new ArrayList<>();

		// 객체 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		list.add(new Board(4, "제목4", "내용4", "글쓴이4", new Date()));
		list.add(new Board(5, "제목5", "내용5", "글쓴이5", new Date()));

		// 저장된 객체 수
		System.out.println("저장된 객체 수 : " + list.size());

		// 2인덱스 객체 얻기
		Board b2 = list.get(2);
		System.out.println(list.get(2));
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//객체 삭제 
		list.remove(2);
		list.remove(2);
		
		
		for (Board b : list) {
			System.out.println(b);
		}
		
	}

}
