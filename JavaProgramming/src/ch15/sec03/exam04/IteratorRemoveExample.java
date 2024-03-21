package ch15.sec03.exam04;

import java.util.ArrayList;
import java.util.*;

public class IteratorRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

//		for(int num: list) {
//			if(num == 3) {
//				list.remove(num);
//			}
//		}
//		
		
		for(int i = 0; i<list.size();i++) {
			if(i == 2) {
				list.remove(i);
				
				
			}
			System.out.println(list.get(2));
			
		}
			
		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String item = iterator.next();
//			if(item.equals("C")) {
//				iterator.remove(); //가지고 온 iterator 을 제거해야 한다.
//			} 
//		}
//		System.out.println(list.size());
		
	}

}
