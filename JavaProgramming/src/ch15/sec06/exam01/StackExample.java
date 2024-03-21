package ch15.sec06.exam01;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
	
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(1));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue());
		}
	}

}
