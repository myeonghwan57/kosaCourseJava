package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 아래 점수 : " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(97));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.ceiling(97));
		System.out.println();

		System.out.println("객체를 내림차순으로"); 
		for (Integer score: scores.descendingSet()) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		System.out.println("범위 검색 (80이상)");
		for(Integer score : scores.tailSet(80, true)) {
			System.out.print(score+ " ");
		}
		System.out.println();
		
		System.out.println("범위 검색 (80이상이면서 95미만)");
		for(Integer score : scores.subSet(80, true, 95, false)) {
			System.out.print(score + " ");
		}
		
	
	}

}
