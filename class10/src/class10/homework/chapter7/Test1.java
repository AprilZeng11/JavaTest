package class10.homework.chapter7;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto at1 = new Auto();
		System.out.println("第一辆车的颜色为" + at1.color + ",行驶速度为" + at1.speed);
		at1.speedUp(30);
		at1.speedDown(10);
		at1.speedDown(20);
		at1.speedStop();
		
		Car car = new Car();
		car.speedUp(100);
		car.speedDown(50);
			
		Auto at2 = new Auto(180);
		System.out.println("行驶速度加速到" + at2.speed);
		
		Auto at4 = new Auto("白色");
		System.out.println("车子颜色改变为" + at4.color + ",车速保持为" + at4.speed);		
	}
}
