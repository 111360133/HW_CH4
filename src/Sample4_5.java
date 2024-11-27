public class Sample4_5 {

	public static void main(String[] args) {
		Car5 car1;
		car1 = new RacingCar5();
		
		car1.setCar(1234,20.5);
		
		car1.show();
	}
}

class Car5{
	protected int num;
	protected double gas;
	
	public Car5() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public void show(){
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}

class RacingCar5 extends Car5{
	private int course;
	
	public RacingCar5() {
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse (int c) {
		course = c; 
		System.out.println("將賽車編號設為" + course);
	}
	
	public void show(){
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車編號是" + course);
	}
}