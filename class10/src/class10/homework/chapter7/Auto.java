package class10.homework.chapter7;
//Auto 类
public class Auto {
	int luntai = 4;
	String color = "红色";
	int weight;
	int speed = 0;
//不同的构造方法	
	public Auto() {}
	public Auto(int speed) {
		this.speed = speed;
	}
	public Auto(String color) {
		this.color = color;
	}
	//加速方法
	public void speedUp(int add) {
		speed += add;
		System.out.println("Auto加速中，速度为" + speed);
	}
	//减速方法
	public void speedDown(int subtract) {
		speed -= subtract;
		if (speed<=0) {
			System.out.println("Auto停止前进");
		}
		else {
		System.out.println("Auto减速为" + speed);
		}
	}
	//停车方法
	public void speedStop() {
		speed = 0;
		System.out.println("Auto停车");		
	}
}
