package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv,String> product1 = new Product<>(); 
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();
		String model = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		
		product2.setKind(new Car());
		product2.setModel("SUV");
		
		Car car =product2.getKind();
		String carModel = product2.getModel();
		System.out.println(carModel);
		System.out.println(model);
	}

}
