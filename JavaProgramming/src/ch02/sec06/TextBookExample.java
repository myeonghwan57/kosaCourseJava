package ch02.sec06;

public class TextBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "" + "{\n" + "\t\"id\":\"winter\",\n" + "\t\"name\":\"눈송이\",\n" + "}";
		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
				""";
		System.out.println(str1);
		System.out.println("===============================");

		System.out.println(str2);
		System.out.println("===============================");
	}

}
