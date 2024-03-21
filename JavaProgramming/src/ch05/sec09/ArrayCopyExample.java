package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array","copy","test1","test2"};
		String[] newStrArray = new String[5];
		
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		for (int i = 0; i<newStrArray.length; i++) {
//			System.out.print(newStrArray[i]+",");
//		}
		System.arraycopy(oldStrArray,0,newStrArray,1,4);
		for(int i = 0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
		
		
	}

}
