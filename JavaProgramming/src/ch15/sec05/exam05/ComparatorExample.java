package ch15.sec05.exam05;

import java.util.*;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeSet = new TreeSet<>();
		treeSet.add(new Fruit("망고", 10000));
		treeSet.add(new Fruit("바나나", 11000));
		treeSet.add(new Fruit("딸기", 13000));
		treeSet.add(new Fruit("수박", 12000));

		for (Fruit f : treeSet) {
			System.out.println(f.price + "-" + f.name);
		}

	}

}
