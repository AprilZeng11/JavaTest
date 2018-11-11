package class10.homework.chapter8;

//抽象类的子类是抽象类
public abstract class AbstractHunan extends AbstractChinese{

	public void eat() {
		//抽象类的子类实现父类的抽象方法
		System.out.println("喜欢吃辣");		
	}
//	public void say() {} //抽象类的子类可以不实现父类的抽象方法
	
	public void fangYan() {
		System.out.println("长沙话");		
	}
}
