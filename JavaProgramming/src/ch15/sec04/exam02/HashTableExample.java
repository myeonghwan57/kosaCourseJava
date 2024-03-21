package ch15.sec04.exam02;
import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new Hashtable<String, Integer>();
		//Map<String, Integer> map = new HashMap<String, Integer>();
		
		Thread threadA = new Thread() {
			public void run() {
				for(int i = 1 ; i<=1000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for(int i = 1001 ; i<=2000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}
		int size = map.size();
		System.out.println(size);
	}	

}
