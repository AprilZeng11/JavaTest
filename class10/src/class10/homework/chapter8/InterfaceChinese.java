package class10.homework.chapter8;

public interface InterfaceChinese{
	//接口的成员变量为常量
	public static final int num = 15;
	
	//接口的方法为抽象方法
	public abstract void eat();
	
	public static void print() {
		System.out.println("打印");
	}

}
