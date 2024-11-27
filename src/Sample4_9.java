public class Sample4_9 {

	public static void main(String[] args) {
		Car9[] cars;
		cars = new Car9[2];
		
		cars[0] = new Car9();		
		cars[1] = new RacingCar9();
		
		for (int i = 0; i < cars.length; i++) {
			Class cl = cars[i].getClass();
			System.out.println("第" + (i + 1) + "個物件的類別是" + cl);
		}
	}
}

class Car9{
	protected int num;
	protected double gas;
	
	public Car9() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}

class RacingCar9 extends Car9{
	public RacingCar9() {
		System.out.println("生產了賽車");
	}
}