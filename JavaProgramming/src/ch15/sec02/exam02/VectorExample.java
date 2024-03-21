package ch15.sec02.exam02;

import java.util.*;

import ch15.sec02.exam01.Board;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<>();

		Thread threadA = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board(1, "제목" + i, "내용" + i, "글쓴이" + i, new Date()));
				}
			}
		};

		Thread threadB = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board(1, "제목" + i, "내용" + i, "글쓴이" + i, new Date()));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadA.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		int size = list.size();
		System.out.println(size);
		System.out.println();
	}

}
