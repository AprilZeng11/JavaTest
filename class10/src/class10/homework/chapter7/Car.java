package class10.homework.chapter7;

public class Car extends Auto{
	String kongdiao = "美的";
	String CD = "test";
	int speed;
	public Car() {}
	//重写加速方法
	public void speedUp(int add) {
		speed += add;
		System.out.println("Car加速中，速度为" + speed);
	}
	//重写
	public void speedDown(int subtract) {
		if (speed<=0) {
			System.out.println("Car停止前进");
		}
		else {
		System.out.println("Car减速为" + speed);
		}
	}

}
