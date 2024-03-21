package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0;i<1000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime- startTime);
		
		
		
		startTime = System.nanoTime();
		for(int i = 0;i<1000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime- startTime);
	}

}
