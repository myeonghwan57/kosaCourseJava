package ch11.sec04;

public class TryWithResourceExample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
			//System.out.println(value);
		} catch (Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
		}
		System.out.println();
		
		try (MyResource res = new MyResource("A")){
			String data = res.read2();
			int value = Integer.parseInt(data); // 예외가 발생 했기 때문에 close 자동으로 실행 된 뒤 예외처리로 이동.
		} catch (Exception e) { //int value = Integer.parseInt(data); 에서 발생한 예외가 넘어오게 되면서 예외 처리 
			System.out.println("예외처리 : " + e.getMessage());
		}
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		MyResource res3 = new MyResource("C");
		
		try (res1;res2){
			String data2 = res2.read2();
			String data1 = res1.read1();
			String data3 = res3.read3();
		
			
			
			
			//int value = Integer.parseInt(data2);
		} catch (Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
		}
	}

}