package repeat0310;
//	Q1. abstract와 interface의 공통점과 차이점
//	상속 혹은 구현받은 클래스에서의 구현을 강제한다
//	abstract는 {} 구현부가 존재하지만 interface는 {}구현부가 존재하지 않음

interface Vehicle { public void run(); }
class MotorCycle implements Vehicle {
	@Override
	public void run() { System.out.println("오토바이가 달립니다"); } 
	public void helemt() { System.out.println("헬멧을 착용합니다"); }
}
class Car implements Vehicle{
	@Override
	public void run() { System.out.println("자동차가 달립니다"); }
}
class Driver{
	public void drive (Vehicle vehicle) { vehicle.run(); };
}
public class Repeat008 {
	public static void main(String[] args) {
		Driver dv = new Driver();
		
		MotorCycle mc = new MotorCycle();
		Car car = new Car();
		
		dv.drive(car);
		
		System.out.println("\n\n> 자동차가 고장나 교통수단을 바꿉니다\n");
		
		dv.drive(mc);
	}
}
