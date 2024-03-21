package ch12.check.Q10;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		StringBuilder strB = new StringBuilder();
		for(int i = 1; i<=100;i++) {
			strB.append(i);
		}
		str = strB.toString();
        System.out.println(str);
		
	}

}
